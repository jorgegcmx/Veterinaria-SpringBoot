package com.vet.demo.Controllers;

import com.vet.demo.Entities.Pacientes;
import com.vet.demo.Services.PacientesService;
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
public class PacientesController {

    @Autowired
    PacientesService service;

    private static final String MENSAJE_OBTENCION_DATOS = "Data Success";
    private static final String MENSAJE_DATOS_NO_ENCONTRADOS = "Data not found";

    @Operation(summary = "Guarda registro Pacientes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = MENSAJE_OBTENCION_DATOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Pacientes.class)) } ),
            @ApiResponse(responseCode = "404" , description = MENSAJE_DATOS_NO_ENCONTRADOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Pacientes.class)) } )
    })
    @PostMapping(value = "/guarda_pacientas", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pacientes> save(@RequestBody Pacientes request){
        return new ResponseEntity<Pacientes>(service.Guarda(request), HttpStatus.OK);
    }

    @Operation(summary = "Lista registro Pacientes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = MENSAJE_OBTENCION_DATOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Pacientes.class)) } ),
            @ApiResponse(responseCode = "404" , description = MENSAJE_DATOS_NO_ENCONTRADOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Pacientes.class)) } )
    })
    @PostMapping(value = "/lista_pacientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Pacientes>> list(){
        return new ResponseEntity<List<Pacientes>>(service.Lista(), HttpStatus.OK);
    }
}
