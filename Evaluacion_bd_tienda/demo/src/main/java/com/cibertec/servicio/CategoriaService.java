package com.cibertec.servicio;

import java.util.List;

import com.cibertec.modelo.Categorias;

public interface CategoriaService {
    List<Categorias> obtenerTodas();
    Categorias obtenerPorId(Integer id);
}

