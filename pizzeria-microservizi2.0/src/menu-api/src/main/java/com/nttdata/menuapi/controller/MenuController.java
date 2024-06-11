package com.nttdata.menuapi.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.menu.server.models.ModelMenu;
import com.nttdata.menu.server.models.ModelPiatto;
import com.nttdata.menu.server.models.ResponseMenu;
import com.nttdata.menuapi.costanti.Costanti;
import com.nttdata.swagger.menu.server.api.MenuInfoApi;

@RestController
public class MenuController implements MenuInfoApi {

	@Override
	public ResponseEntity<ResponseMenu> getMenu() {
    	ResponseMenu base = new ResponseMenu();
		
    	ModelMenu menu = new ModelMenu();
		try (BufferedReader br = new BufferedReader(new FileReader(Costanti.MENU_FILE_PATH))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	        	ModelPiatto piatto = new ModelPiatto();
	        	piatto.setNome(line.split(",")[0]);
	        	piatto.setCosto(Double.valueOf(line.split(",")[1]));
	        	menu.addListaPiattiItem(piatto);
	        }
	    } catch (IOException e) {
	    	base.setErrors(e.getMessage());
	    	base.setSuccess(Boolean.FALSE);
	        return new ResponseEntity<>(base, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
		base.setResultCode(200);
		base.setReturnValue(menu);
        return new ResponseEntity<>(base, HttpStatus.OK);
	}
	
}
