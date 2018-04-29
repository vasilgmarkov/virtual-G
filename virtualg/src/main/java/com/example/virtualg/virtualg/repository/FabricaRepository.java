package com.example.virtualg.virtualg.repository;

import com.example.virtualg.virtualg.model.Fabricas;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by vasil on 23/04/2018.
 */


public interface FabricaRepository extends CrudRepository<Fabricas, Long> {

    @Query(value = "SELECT * FROM Fabricas j where j.id = :id  ",nativeQuery = true)
    Fabricas findById(@Param("id") Long id);


}
