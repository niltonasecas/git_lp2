package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.modelo.Habitaciones;
@Repository
public interface HabitacionesRepository extends JpaRepository<Habitaciones,Integer>{

}
