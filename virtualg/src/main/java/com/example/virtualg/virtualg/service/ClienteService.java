package com.example.virtualg.virtualg.service;

import com.example.virtualg.virtualg.model.Clientes;
import com.example.virtualg.virtualg.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasil on 22/04/2018.
 */

@Service
public class ClienteService {
    @Resource(name = "clienteRepository")
    private ClienteRepository clienteRepository;

   public List<Clientes> getAllClientes() {
        //return topics
        List<Clientes> topics = new ArrayList<>();
        clienteRepository.findAll()
                .forEach(topics :: add);
        return topics;

    }

    public Clientes getCliente(Integer id) {
        return clienteRepository.findById(id);
    }

    public void addCliente(Clientes clientes) {
        clienteRepository.save(clientes);
    }

    public void updateCliente(Integer id, Clientes clientes) {
            Clientes cliente = new Clientes();
            cliente = clienteRepository.findById(id);
            cliente.setNombre(clientes.getNombre());
            cliente.setApellidos(clientes.getApellidos());
            cliente.setDni(clientes.getDni());
            cliente.setCd(clientes.getCd());
            cliente.setPoblacion(clientes.getPoblacion());
            cliente.setTlf(clientes.getTlf());

        }

    public void deleteCliente(Long id) {

         clienteRepository.delete(id);
    }

}
