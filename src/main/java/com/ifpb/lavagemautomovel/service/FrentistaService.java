package com.ifpb.lavagemautomovel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ifpb.lavagemautomovel.repository.frentistaRepository;
import com.ifpb.lavagemautomovel.model.Frentista;

import java.util.List;
import java.util.Optional;

@Service
public class FrentistaService {

    @Autowired
    frentistaRepository frentistaRepository;

    public List<Frentista> list(){
        return frentistaRepository.findAll();
    }

    public Optional<Frentista> search(Long id){
        return frentistaRepository.findById(id);
    }

    public Frentista insert(Frentista frentista){
        return frentistaRepository.save(frentista);
    }

    public void delete(Long id){
        frentistaRepository.deleteById(id);
    }
}
