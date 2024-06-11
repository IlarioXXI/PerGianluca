package com.nttdata.ordiniapi.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.ordini.server.models.ModelOrdine;
import com.nttdata.ordini.server.models.ModelOrdineBase;
import com.nttdata.ordini.server.models.ModelOrdiniList;
import com.nttdata.ordini.server.models.ModelPiatto;
import com.nttdata.ordini.server.models.ResponseBase;
import com.nttdata.ordini.server.models.ResponseOrdiniList;
import com.nttdata.ordiniapi.costanti.Costanti;
import com.nttdata.swagger.ordini.server.api.OrdiniInfoApi;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
public class OrdiniController implements OrdiniInfoApi {

	@Override
	public ResponseEntity<ResponseBase> aggiungiOrdine(@Parameter(in = ParameterIn.DEFAULT, description = "Body Creazione Ordine", required=true, schema=@Schema()) @Valid @RequestBody ModelOrdineBase body) {
		ResponseBase base = buildResponseBase();

		try {
			StringBuilder listaPiattiBuilder = new StringBuilder();
			Double costoTotale = 0d;
			for(ModelPiatto piatto : body.getListaPiatti()) {
				listaPiattiBuilder.append(piatto.getNome());
				listaPiattiBuilder.append(",");
				costoTotale += piatto.getCosto();
			}
			
			List<String> orders = Files.readAllLines(Paths.get(Costanti.ORDINI_FILE_PATH));
			
			Integer ordineId = orders.size() + 1;
			
			String newOrder = ordineId + ";" + listaPiattiBuilder.toString() + ";" + costoTotale + ";Inserito";

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(Costanti.ORDINI_FILE_PATH, true))) {
				bw.write(newOrder);
				bw.newLine();
			}
		} catch (IOException e) {
	    	base.setErrors(e.getMessage());
	    	base.setSuccess(Boolean.FALSE);
	        return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(base, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseBase> eliminaOrdine(@Parameter(in = ParameterIn.PATH, description = "id Ordine", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
		ResponseBase base = buildResponseBase();
		try {
			List<String> orders = Files.readAllLines(Paths.get(Costanti.ORDINI_FILE_PATH));
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(Costanti.ORDINI_FILE_PATH))) {
				for (String order : orders) {
					if (!order.startsWith(String.valueOf(id) + ";")) {
						bw.write(order);
						bw.newLine();
					}
				}
			}
		} catch (IOException e) {
	    	base.setErrors(e.getMessage());
	    	base.setSuccess(Boolean.FALSE);
	        return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(base, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseOrdiniList> getOrdini() {
		ModelOrdiniList ordiniList = new ModelOrdiniList();
		ResponseOrdiniList base = new ResponseOrdiniList();
		base.setSuccess(Boolean.TRUE);
		base.setResultCode(200);
		try {
			List<String> orders = Files.readAllLines(Paths.get(Costanti.ORDINI_FILE_PATH));
			for (String ordineStringa : orders) {
				String[] split = ordineStringa.split(";");
				ModelOrdine ordine = new ModelOrdine();
				ordine.setId(Integer.parseInt(split[0]));
				ordine.setDescrizione(split[1]);
				ordine.setTotale(Double.parseDouble(split[2]));
				ordine.setStato(split[3]);
				ordiniList.addListaOrdiniItem(ordine);
			}
		} catch (IOException e) {
	    	base.setErrors(e.getMessage());
	    	base.setSuccess(Boolean.FALSE);
	        return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
		base.setReturnValue(ordiniList);
		return new ResponseEntity<>(base, HttpStatus.OK);
	}
	
	private ResponseBase buildResponseBase() {
		ResponseBase responseBase = new ResponseBase();
		responseBase.setSuccess(Boolean.TRUE);
		responseBase.setResultCode(200);
		return responseBase;
	}
}
