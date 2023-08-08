package com.vet.demo.Controllers;

import com.vet.demo.Entities.Citas;
import com.vet.demo.Services.CitasService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitasController {

    @Autowired
    CitasService service;

    private static final String MENSAJE_OBTENCION_DATOS = "Data Success";
    private static final String MENSAJE_DATOS_NO_ENCONTRADOS = "Data not found";

    @Operation(summary = "Guarda registro Citas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = MENSAJE_OBTENCION_DATOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Citas.class)) } ),
            @ApiResponse(responseCode = "404" , description = MENSAJE_DATOS_NO_ENCONTRADOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Citas.class)) } )
    })
    @PostMapping(value = "/guarda_citas", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Citas> save(@RequestBody Citas request){
        return new ResponseEntity<Citas>(service.Guarda(request), HttpStatus.OK);
    }

    @Operation(summary = "Lista registro Citas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = MENSAJE_OBTENCION_DATOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Citas.class)) } ),
            @ApiResponse(responseCode = "404" , description = MENSAJE_DATOS_NO_ENCONTRADOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Citas.class)) } )
    })
    @PostMapping(value = "/lista_citas", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Citas>> list(){
        return new ResponseEntity<List<Citas>>(service.Lista(), HttpStatus.OK);
    }
}
