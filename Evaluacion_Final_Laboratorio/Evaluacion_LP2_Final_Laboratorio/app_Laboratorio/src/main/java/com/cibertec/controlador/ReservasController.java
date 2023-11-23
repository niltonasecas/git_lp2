package com.cibertec.controlador;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cibertec.servicio.ReservasService;

public class ReservasController {
    private final ReservasService reservasService;

    public ReservasController(ReservasService reservasService) {
        this.reservasService = reservasService;
    }

    @GetMapping("/reservas")
    public String listarReservas(Model model) {
        model.addAttribute("reservas", reservasService.obtenerTodasReservas());
        return "reservas/lista";
    }

    @GetMapping("/reservas/{id}")
    public String verReserva(@PathVariable Integer id, Model model) {
        reservasService.obtenerReservaPorId(id).ifPresent(reserva -> model.addAttribute("reserva", reserva));
        return "reservas/detalle";
    }

}
