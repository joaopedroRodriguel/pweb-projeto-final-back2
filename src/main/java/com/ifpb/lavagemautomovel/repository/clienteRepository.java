package com.ifpb.lavagemautomovel.repository;

import com.ifpb.lavagemautomovel.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends JpaRepository<Cliente, Long> {
}