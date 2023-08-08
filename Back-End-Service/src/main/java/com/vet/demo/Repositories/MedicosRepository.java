package com.vet.demo.Repositories;
import com.vet.demo.Entities.Medicos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicosRepository extends CrudRepository<Medicos, Long> {
}
