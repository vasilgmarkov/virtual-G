package com.example.virtualg.virtualg.service;

import com.example.virtualg.virtualg.model.Clientes;
import com.example.virtualg.virtualg.model.Facturas;
import com.example.virtualg.virtualg.repository.ClienteRepository;
import com.example.virtualg.virtualg.repository.FacturaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasil on 22/04/2018.
 */

@Service
public class FacturaService {
    @Resource(name = "facturaRepository")
    private FacturaRepository facturaRepository;

    public List<Facturas> getAllFacturas() {
        //return topics
        List<Facturas> facturas = new ArrayList<>();
        facturaRepository.findAll()
                .forEach(facturas :: add);
        return facturas;

    }

    public Facturas getFactura(Integer id) {
        return facturaRepository.findById(id);
    }

    public void addFactura(Facturas factura) {
        facturaRepository.save(factura);
    }

    public void updateFactura(Integer id, Facturas factura) {
        facturaRepository.save(factura);

    }

    public void deleteFactura(Integer id) {

        facturaRepository.delete(id);
    }

}
