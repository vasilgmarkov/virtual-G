package com.example.virtualg.virtualg.controller;


import com.example.virtualg.virtualg.model.Fabricas;
import com.example.virtualg.virtualg.service.FabricaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by vasil on 21/04/2018.
 */

@RestController
public class FabricaController {
    @Resource(name = "fabricaService")
    private FabricaService fabricaService;

    @RequestMapping(value="/fabricas", method = RequestMethod.GET)
    public ModelAndView fabricas(){
        ModelAndView modelAndView = new ModelAndView();
        List<Fabricas> fabricas = fabricaService.getAllFabricas();
        modelAndView.addObject("fabricas", fabricas);
        modelAndView.setViewName("/fabricas");
        return modelAndView;
    }

    @RequestMapping(value="/fabricas/{id}", method = RequestMethod.GET)
    public Fabricas getFabrica(@PathVariable Long id){
        return fabricaService.getFabrica(id);
    }

    @RequestMapping(value = "/fabricas", method = RequestMethod.POST)
    public void addCliente(@RequestBody Fabricas fabricas){
        fabricaService.addFabrica(fabricas);
    }

    @RequestMapping(value="/fabricas/{id}", method = RequestMethod.PUT)
    public void updateFabrica(@RequestBody Fabricas fabrica, @PathVariable Long id){
        fabricaService.updateFabrica(id,fabrica);
    }

    @RequestMapping(value="/fabricas/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable Long id){
        fabricaService.deleteFabrica(id);
    }
}
