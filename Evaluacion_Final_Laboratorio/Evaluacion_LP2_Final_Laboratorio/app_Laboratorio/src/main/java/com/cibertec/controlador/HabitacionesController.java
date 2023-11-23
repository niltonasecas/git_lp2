package com.cibertec.controlador;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cibertec.servicio.HabitacionesService;

public class HabitacionesController {
	private final HabitacionesService habitacionesService;

    public HabitacionesController(HabitacionesService habitacionesService) {
        this.habitacionesService = habitacionesService;
    }

    @GetMapping("/habitaciones")
    public String listarHabitaciones(Model model) {
        model.addAttribute("habitaciones", habitacionesService.obtenerTodasHabitaciones());
        return "habitaciones/lista";
    }

    @GetMapping("/habitaciones/{id}")
    public String verHabitacion(@PathVariable Integer id, Model model) {
        habitacionesService.obtenerHabitacionPorId(id).ifPresent(habitacion -> model.addAttribute("habitacion", habitacion));
        return "habitaciones/detalle";
    }

}
