package com.ifpb.lavagemautomovel.repository;

import com.ifpb.lavagemautomovel.model.Frentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface frentistaRepository extends JpaRepository<Frentista, Long> {
}