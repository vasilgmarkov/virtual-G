package com.example.virtualg.virtualg.controller;

import com.example.virtualg.virtualg.model.Clientes;
import com.example.virtualg.virtualg.model.Fabricas;
import com.example.virtualg.virtualg.model.Facturas;
import com.example.virtualg.virtualg.repository.ClienteRepository;
import com.example.virtualg.virtualg.service.ClienteService;
import com.example.virtualg.virtualg.service.FacturaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by vasil on 21/04/2018.
 */

@RestController
public class FacturaController {
    @Resource(name = "facturaService")
    private FacturaService facturaService;

    @Resource(name = "clienteRepository")
    private ClienteRepository clienteRepository;

    @RequestMapping(value="/facturas", method = RequestMethod.GET)
    public ModelAndView clientes(){
        ModelAndView modelAndView = new ModelAndView();
        List<Facturas> facturas = facturaService.getAllFacturas();
        modelAndView.addObject("facturas", facturas);
        modelAndView.setViewName("/facturas");
        return modelAndView;
    }

    @RequestMapping(value="/facturas/{id}", method = RequestMethod.GET)
    public Facturas getFactura(@PathVariable Integer id){
        return facturaService.getFactura(id);
    }

    @RequestMapping(value = "/facturas", method = RequestMethod.POST)
    public void addFactura(@RequestBody Facturas factura){
        factura.setCliente(new Clientes(factura.getCliente().getId(),"","","","","",""));
        factura.setFabrica(new Fabricas(factura.getFabrica().getId()));
        facturaService.addFactura(factura);
    }

    @RequestMapping(value="/facturas/{id}", method = RequestMethod.PUT)
    public void updateFactura(@RequestBody Facturas factura, @PathVariable Integer id){
        facturaService.updateFactura(id,factura);
    }

    @RequestMapping(value="/facturas/{id}", method = RequestMethod.DELETE)
    public void deleteFactura(@PathVariable Integer id){
        facturaService.deleteFactura(id);
    }
}
