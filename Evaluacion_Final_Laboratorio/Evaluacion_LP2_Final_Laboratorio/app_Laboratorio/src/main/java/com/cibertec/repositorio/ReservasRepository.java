package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.modelo.Reservas;
@Repository
public interface ReservasRepository extends JpaRepository <Reservas,Integer>{

}
