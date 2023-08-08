package com.vet.demo.Services.ServicesIpm;

import com.vet.demo.Entities.Pacientes;
import com.vet.demo.Repositories.PacientesRepository;
import com.vet.demo.Services.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacientesIpm implements PacientesService {

    @Autowired
    PacientesRepository repository;

    @Override
    public Pacientes Guarda(Pacientes request) {
        return repository.save(request);
    }

    @Override
    public List<Pacientes> Lista() {
        return (List<Pacientes>) repository.findAll();
    }
}
