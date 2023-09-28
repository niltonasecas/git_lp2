package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Medicamentos;

public interface IMedicamentosRepositorio extends JpaRepository<Medicamentos, Integer> {

}
