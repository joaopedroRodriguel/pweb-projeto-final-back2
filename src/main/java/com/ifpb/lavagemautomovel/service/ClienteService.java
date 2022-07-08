package com.ifpb.lavagemautomovel.service;

import com.ifpb.lavagemautomovel.model.Cliente;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ifpb.lavagemautomovel.repository.clienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    clienteRepository clienteRepository;

    public List<Cliente> list(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> search(Long id){
        return clienteRepository.findById(id);
    }

    public Cliente insert(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente update(Long id, Cliente newcliente){
        Optional<Cliente> oldcliente = clienteRepository.findById(id);
        Cliente cliente1 = oldcliente.get();
        BeanUtils.copyProperties(newcliente, cliente1, "id");
        return clienteRepository.save(cliente1);
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }



}
