package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Carrito;



public interface CarritoRepository extends JpaRepository<Carrito, Integer> {
}
