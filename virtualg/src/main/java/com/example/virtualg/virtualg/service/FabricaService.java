package com.example.virtualg.virtualg.service;

import com.example.virtualg.virtualg.model.Fabricas;
import com.example.virtualg.virtualg.repository.FabricaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasil on 22/04/2018.
 */

@Service
public class FabricaService {
    @Resource(name = "fabricaRepository")
    private FabricaRepository fabricaRepository;

    public List<Fabricas> getAllFabricas() {
        //return topics
        List<Fabricas> fabricas = new ArrayList<>();
        fabricaRepository.findAll()
                .forEach(fabricas :: add);
        return fabricas;

    }

    public Fabricas getFabrica(Long id) {
        return fabricaRepository.findById(id);
    }

    public void addFabrica(Fabricas fabricas) {
        fabricaRepository.save(fabricas);
    }

    public void updateFabrica(Long id, Fabricas fabricas) {
        fabricaRepository.save(fabricas);

    }

    public void deleteFabrica(Long id) {

        fabricaRepository.delete(id);
    }

}
