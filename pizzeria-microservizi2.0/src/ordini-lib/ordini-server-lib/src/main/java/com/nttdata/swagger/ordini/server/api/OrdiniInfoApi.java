/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.nttdata.swagger.ordini.server.api;

import com.nttdata.ordini.server.models.ModelOrdineBase;
import com.nttdata.ordini.server.models.ResponseBase;
import com.nttdata.ordini.server.models.ResponseOrdiniList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-30T22:29:46.811185500+02:00[Europe/Paris]")
@Validated
public interface OrdiniInfoApi {

    Logger log = LoggerFactory.getLogger(OrdiniInfoApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @Operation(summary = "Aggiungi Ordine", description = "", tags={ "Ordini Info" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ResponseBase.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Input", content = @Content(schema = @Schema(implementation = ResponseBase.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication token required"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        
        @ApiResponse(responseCode = "404", description = "The requested resource could not be found", content = @Content(schema = @Schema(implementation = ResponseBase.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server error", content = @Content(schema = @Schema(implementation = ResponseBase.class))) })
    @RequestMapping(value = "/ordini",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<ResponseBase> aggiungiOrdine(@Parameter(in = ParameterIn.DEFAULT, description = "Body Creazione Ordine", required=true, schema=@Schema()) @Valid @RequestBody ModelOrdineBase body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"success\" : true,\r\n  \"resultCode\" : 0,\r\n  \"message\" : \"message\",\r\n  \"type\" : \"type\",\r\n  \"errors\" : \"errors\",\r\n  \"transactionId\" : \"transactionId\"\r\n}", ResponseBase.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default OrdiniInfoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Elimina Ordine", description = "", tags={ "Ordini Info" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ResponseBase.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Input", content = @Content(schema = @Schema(implementation = ResponseBase.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication token required"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        
        @ApiResponse(responseCode = "404", description = "The requested resource could not be found", content = @Content(schema = @Schema(implementation = ResponseBase.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server error", content = @Content(schema = @Schema(implementation = ResponseBase.class))) })
    @RequestMapping(value = "/delete/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<ResponseBase> eliminaOrdine(@Parameter(in = ParameterIn.PATH, description = "id Ordine", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"success\" : true,\r\n  \"resultCode\" : 0,\r\n  \"message\" : \"message\",\r\n  \"type\" : \"type\",\r\n  \"errors\" : \"errors\",\r\n  \"transactionId\" : \"transactionId\"\r\n}", ResponseBase.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default OrdiniInfoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Retrieve Ordini List", description = "", tags={ "Ordini Info" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ResponseOrdiniList.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Input", content = @Content(schema = @Schema(implementation = ResponseBase.class))),
        
        @ApiResponse(responseCode = "401", description = "Authentication token required"),
        
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        
        @ApiResponse(responseCode = "404", description = "The requested resource could not be found", content = @Content(schema = @Schema(implementation = ResponseBase.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server error", content = @Content(schema = @Schema(implementation = ResponseBase.class))) })
    @RequestMapping(value = "/ordini",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ResponseOrdiniList> getOrdini() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"\"", ResponseOrdiniList.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default OrdiniInfoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}

