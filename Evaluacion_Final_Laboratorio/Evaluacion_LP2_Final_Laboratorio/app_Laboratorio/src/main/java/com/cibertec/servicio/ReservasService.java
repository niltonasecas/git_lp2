package com.cibertec.servicio;

import java.util.List;
import java.util.Optional;

import com.cibertec.modelo.Reservas;

public interface ReservasService {
	List<Reservas> obtenerTodasReservas();
    Optional<Reservas> obtenerReservaPorId(Integer id);
    void actualizarEstadoPago(int reservaId);
}
