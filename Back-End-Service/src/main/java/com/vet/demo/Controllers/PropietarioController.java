package com.vet.demo.Controllers;

import com.vet.demo.Entities.Pacientes;
import com.vet.demo.Entities.Propietario;
import com.vet.demo.Services.PacientesService;
import com.vet.demo.Services.PropietarioService;
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
public class PropietarioController {
    @Autowired
    PropietarioService service;

    private static final String MENSAJE_OBTENCION_DATOS = "Data Success";
    private static final String MENSAJE_DATOS_NO_ENCONTRADOS = "Data not found";

    @Operation(summary = "Guarda registro Propietario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = MENSAJE_OBTENCION_DATOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Propietario.class)) } ),
            @ApiResponse(responseCode = "404" , description = MENSAJE_DATOS_NO_ENCONTRADOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Propietario.class)) } )
    })
    @PostMapping(value = "/guarda_propietario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Propietario> save(@RequestBody Propietario request){
        return new ResponseEntity<Propietario>(service.Guarda(request), HttpStatus.OK);
    }

    @Operation(summary = "Lista registro Propietario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" , description = MENSAJE_OBTENCION_DATOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Propietario.class)) } ),
            @ApiResponse(responseCode = "404" , description = MENSAJE_DATOS_NO_ENCONTRADOS, content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Propietario.class)) } )
    })
    @PostMapping(value = "/lista_propietario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Propietario>> list(){
        return new ResponseEntity<List<Propietario>>(service.Lista(), HttpStatus.OK);
    }
}
