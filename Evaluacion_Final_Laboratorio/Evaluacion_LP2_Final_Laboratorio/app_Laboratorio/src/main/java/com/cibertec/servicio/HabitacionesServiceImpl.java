package com.cibertec.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Habitaciones;
import com.cibertec.repositorio.HabitacionesRepository;
@Service
public class HabitacionesServiceImpl implements HabitacionesService {

    @Autowired
    private HabitacionesRepository habitacionRepository;

    @Override
    public List<Habitaciones> obtenerTodasHabitaciones() {
        return habitacionRepository.findAll();
    }

    @Override
    public Optional<Habitaciones> obtenerHabitacionPorId(Integer id) {
        return habitacionRepository.findById(id);
    }

}
