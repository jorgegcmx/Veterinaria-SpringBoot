package com.vet.demo.Repositories;

import com.vet.demo.Entities.Pacientes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepository extends CrudRepository<Pacientes, Long> {
}
