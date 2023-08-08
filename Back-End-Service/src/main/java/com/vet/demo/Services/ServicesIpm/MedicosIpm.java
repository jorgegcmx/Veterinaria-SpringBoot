package com.vet.demo.Services.ServicesIpm;

import com.vet.demo.Entities.Medicos;
import com.vet.demo.Repositories.MedicosRepository;
import com.vet.demo.Services.MedicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicosIpm implements MedicosService {

    @Autowired
    MedicosRepository repository;

    @Override
    public Medicos Guarda(Medicos request) {
        return repository.save(request);
    }

    @Override
    public List<Medicos> Lista() {
        return (List<Medicos>) repository.findAll();
    }
}
