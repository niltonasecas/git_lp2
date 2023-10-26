package com.cibertec.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {


    @GetMapping("/catalogo")
    public String mostrarCatalogo(Model model) {
      
        return "catalogo";
    }

 
}
