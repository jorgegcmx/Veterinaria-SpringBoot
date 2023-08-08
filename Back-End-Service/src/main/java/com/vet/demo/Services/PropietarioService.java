package com.vet.demo.Services;

import com.vet.demo.Entities.Propietario;

import java.util.List;

public interface PropietarioService {
    Propietario Guarda(Propietario request);
    List<Propietario> Lista();
}
