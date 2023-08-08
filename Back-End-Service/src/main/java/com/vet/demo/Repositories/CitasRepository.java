package com.vet.demo.Repositories;

import com.vet.demo.Entities.Citas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitasRepository  extends CrudRepository<Citas,Long> {
}
