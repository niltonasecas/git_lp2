package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.modelo.Medicamentos;
import com.cibertec.repositorio.IMedicamentosRepositorio;

@Controller
public class MedicamentosController {

    @Autowired
    private IMedicamentosRepositorio medicamentosRepositorio;

    @GetMapping("/")
    public String listarMedicamentos(Model model) {
        List<Medicamentos> medicamentos = medicamentosRepositorio.findAll();
        model.addAttribute("medicamentos", medicamentos);
        return "listarMedicamentos"; // nombre de la vista
    }

    @PostMapping("/guardar")
    public String guardarMedicamento(@ModelAttribute Medicamentos medicamento) {
        medicamentosRepositorio.save(medicamento);
        return "redirect:/medicamentos/"; // redirecciona para ver la lista
    }
}


