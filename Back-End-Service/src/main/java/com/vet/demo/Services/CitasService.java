package com.vet.demo.Services;

import com.vet.demo.Entities.Citas;

import java.util.List;

public interface CitasService {
    Citas Guarda(Citas request);
    List<Citas> Lista();
}
