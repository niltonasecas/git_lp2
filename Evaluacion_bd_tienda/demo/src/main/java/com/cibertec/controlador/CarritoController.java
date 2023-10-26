package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.modelo.Productos;
import com.cibertec.servicio.CarritoService;

@Controller
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping("/carrito")
    public String mostrarCarrito(Model model) {
        List<Productos> productosEnCarrito = carritoService.obtenerProductosEnCarrito();
        double montoTotal = carritoService.calcularMontoTotal();
        model.addAttribute("productosEnCarrito", productosEnCarrito);
        model.addAttribute("montoTotal", montoTotal);
        return "carrito";
    }
}
