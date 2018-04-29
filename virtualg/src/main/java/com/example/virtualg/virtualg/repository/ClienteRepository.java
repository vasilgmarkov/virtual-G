package com.example.virtualg.virtualg.repository;

import com.example.virtualg.virtualg.model.Clientes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by vasil on 23/04/2018.
 */


public interface ClienteRepository extends CrudRepository<Clientes, Long> {

    @Query(value = "SELECT * FROM Clientes j where j.id = :id  ",nativeQuery = true)
    Clientes findById(@Param("id") Integer id);




}

