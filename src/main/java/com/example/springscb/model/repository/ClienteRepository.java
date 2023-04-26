package com.example.springscb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springscb.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
