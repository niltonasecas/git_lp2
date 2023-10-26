package com.cibertec.servicio;

import java.util.List;

import com.cibertec.modelo.Productos;

public interface ProductoService {
    List<Productos> obtenerTodos();
    Productos obtenerPorId(Integer id);
}
