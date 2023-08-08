package com.vet.demo.Services.ServicesIpm;

import com.vet.demo.Entities.Propietario;
import com.vet.demo.Repositories.PropietarioRepository;
import com.vet.demo.Services.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioIpm implements PropietarioService {

    @Autowired
    PropietarioRepository repository;

    @Override
    public Propietario Guarda(Propietario request) {
        return repository.save(request);
    }

    @Override
    public List<Propietario> Lista() {
        return (List<Propietario>) repository.findAll();
    }
}
