package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.modelo.Categorias;
import com.cibertec.servicio.CategoriaService;

@Controller
public class CompraController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/showcarrito")
    public String mostrarCarrito(Model model) {
        model.addAttribute("compras", categoriaService.obtenerTodas());
        return "carrito";
    }

    @GetMapping("/resumen")
    public String mostrarResumenCompra(Model model) {
        List<Categorias> compras = categoriaService.obtenerTodas();
        double totalCompra = calcularTotalCompra(compras);
        model.addAttribute("compras", compras);
        model.addAttribute("totalCompra", totalCompra);
        return "resumen";
    }

    private double calcularTotalCompra(List<Categorias> compras) {
        double total = 0.0;
        for (Categorias compra : compras) {
            // Asegúrate de tener un método para obtener el total de una compra (Categorias)
            total += compra.getTotal(); 
        }
        return total;
    }
}
