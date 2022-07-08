package com.ifpb.lavagemautomovel.controller;
import com.ifpb.lavagemautomovel.service.FrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ifpb.lavagemautomovel.model.Frentista;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class FrentistaController {

    @Autowired
    FrentistaService frentistaService;

    @CrossOrigin
    @GetMapping("/listfrentistas")
    public ResponseEntity<?> list(){
        List<Frentista> areas = frentistaService.list();
        return new ResponseEntity<>(areas, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/searchfrentista/{id}")
    public ResponseEntity<?> search(Long id) {
        Optional<Frentista> area = frentistaService.search(id);
        return new ResponseEntity<>(area, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/insertfrentista")
    public ResponseEntity<?> insert(@RequestBody Frentista newfrentista) {
        Frentista frentista1 = frentistaService.insert(newfrentista);
        return new ResponseEntity<>(frentista1, HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping("/deletefrentista/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        frentistaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }





}
