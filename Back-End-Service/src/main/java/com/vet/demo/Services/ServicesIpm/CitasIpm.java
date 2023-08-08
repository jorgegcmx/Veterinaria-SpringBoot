package com.vet.demo.Services.ServicesIpm;

import com.vet.demo.Entities.Citas;
import com.vet.demo.Repositories.CitasRepository;
import com.vet.demo.Services.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitasIpm implements CitasService {

    @Autowired
    CitasRepository repository;

    @Override
    public Citas Guarda(Citas request) {
        return repository.save(request);
    }

    @Override
    public List<Citas> Lista() {
        return (List<Citas>) repository.findAll();
    }
}
