package com.cibertec.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Categorias;
import com.cibertec.repositorio.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categorias> obtenerTodas() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categorias obtenerPorId(Integer id) {
        return categoriaRepository.findById(id).orElse(null);
    }
}
