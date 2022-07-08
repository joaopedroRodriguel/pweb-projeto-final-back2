package com.ifpb.lavagemautomovel.controller;
import com.ifpb.lavagemautomovel.model.Cliente;
import com.ifpb.lavagemautomovel.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @CrossOrigin
    @GetMapping("/listclientes")
    public ResponseEntity<?> list(){
        List<Cliente> clientes = clienteService.list();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/searchcliente/{id}")
    public ResponseEntity<?> search(Long id) {
        Optional<Cliente> cliente = clienteService.search(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/insertcliente")
    public ResponseEntity<?> insert(@RequestBody Cliente c) {
        return new ResponseEntity<>(clienteService.insert(c), HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping("/deletecliente/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping("/updatecliente/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Cliente newcliente){
        Cliente cliente1 = clienteService.update(id, newcliente);
        return new ResponseEntity<>(cliente1, HttpStatus.OK);
    }
}
