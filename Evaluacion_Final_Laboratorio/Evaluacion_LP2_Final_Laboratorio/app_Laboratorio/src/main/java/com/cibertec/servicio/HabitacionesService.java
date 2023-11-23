package com.cibertec.servicio;

import java.util.List;
import java.util.Optional;

import com.cibertec.modelo.Habitaciones;

public interface HabitacionesService {
	 List<Habitaciones> obtenerTodasHabitaciones();
	    Optional<Habitaciones> obtenerHabitacionPorId(Integer id);

}
