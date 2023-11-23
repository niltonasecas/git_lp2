package com.cibertec.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.servicio.ReservasService;

@Controller
@RequestMapping("/pago")
public class PagoController {

    @Autowired
    private ReservasService reservasService;

    @GetMapping
    public String mostrarPaginaPago(Model model) {
        // Mostrar la página de formulario de pago
        model.addAttribute("reservaId", 1); 
        return "pago";
    }

    @PostMapping("/realizarPago")
    public String realizarPago(@RequestParam("reservaId") int reservaId, Model model) {
        // Lógica para procesar el pago (simulado)
        boolean pagoExitoso = true; // En un escenario real, esto se determinaría según la pasarela de pago

        if (pagoExitoso) {
            // Actualizar el estado de pago en la tabla de reservas
            reservasService.actualizarEstadoPago(reservaId);
            // Redirigir a la página de confirmación de reserva
            return "redirect:/confirmacionReserva?reservaId=" + reservaId;
        } else {
            // El pago falló, manejar según tus requerimientos
            return "redirect:/pago?error=true";
        }
    }
}

