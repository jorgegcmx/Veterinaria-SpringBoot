package com.vet.demo.Services;

import com.vet.demo.Entities.Medicos;

import java.util.List;

public interface MedicosService {
    Medicos Guarda(Medicos request);
    List<Medicos> Lista();
}
