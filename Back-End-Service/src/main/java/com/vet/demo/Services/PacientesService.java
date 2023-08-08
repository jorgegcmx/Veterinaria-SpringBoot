package com.vet.demo.Services;

import com.vet.demo.Entities.Pacientes;

import java.util.List;

public interface PacientesService {
    Pacientes Guarda(Pacientes request);
    List<Pacientes> Lista();
}
