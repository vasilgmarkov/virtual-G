package com.example.virtualg.virtualg.repository;

import com.example.virtualg.virtualg.model.Facturas;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vasil on 29/04/2018.
 */
public interface FacturaRepository extends CrudRepository<Facturas, Integer> {

    public Facturas findById(Integer id);

}
