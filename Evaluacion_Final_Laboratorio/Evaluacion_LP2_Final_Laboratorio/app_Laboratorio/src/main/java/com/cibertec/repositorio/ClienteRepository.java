package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.modelo.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
