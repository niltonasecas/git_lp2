package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.modelo.Categorias;

public interface CategoriaRepository extends JpaRepository<Categorias, Integer> {
    
}

