package com.vet.demo.Repositories;

import com.vet.demo.Entities.Propietario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends CrudRepository<Propietario,Long> {
}
