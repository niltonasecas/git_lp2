package com.cibertec.servicio;

import com.cibertec.modelo.Productos;

import java.util.List;

public interface CarritoService {
    void agregarAlCarrito(Productos producto);
    List<Productos> obtenerProductosEnCarrito();
    double calcularMontoTotal();
    void procesarCompra();
    void cancelarCompra();
    Productos obtenerProductoPorId(Integer id);
}
