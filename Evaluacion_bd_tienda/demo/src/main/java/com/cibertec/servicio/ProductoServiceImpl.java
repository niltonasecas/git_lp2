package com.cibertec.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Productos;
import com.cibertec.repositorio.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Productos> obtenerTodos() {
        return productoRepository.findAll();
    }

    @Override
    public Productos obtenerPorId(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }
}