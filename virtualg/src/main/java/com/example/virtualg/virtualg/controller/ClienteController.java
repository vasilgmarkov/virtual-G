package com.example.virtualg.virtualg.controller;


import com.example.virtualg.virtualg.model.Clientes;
import com.example.virtualg.virtualg.service.ClienteService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by vasil on 21/04/2018.
 */

@RestController
public class ClienteController {
    @Resource(name = "clienteService")
    private ClienteService clienteService;

    @RequestMapping(value="/admin/clientes", method = RequestMethod.GET)
    public ModelAndView clientes(){
        ModelAndView modelAndView = new ModelAndView();
        List<Clientes> clientes = clienteService.getAllClientes();
        modelAndView.addObject("clientes", clientes);
        modelAndView.setViewName("admin/clientes");
        return modelAndView;
    }

    @RequestMapping(value="/admin/clientes/{id}", method = RequestMethod.GET)
    public Clientes getCliente(@PathVariable Integer id){
        return clienteService.getCliente(id);
    }

    @RequestMapping(value = "/admin/clientes", method = RequestMethod.POST)
    public void addCliente(@RequestBody Clientes clientes){
        clienteService.addCliente(clientes);
    }

    @RequestMapping(value="/admin/clientes/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Clientes cliente, @PathVariable Integer id){
        clienteService.updateCliente(id,cliente);
    }

    @RequestMapping(value="/admin/clientes/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }
}
