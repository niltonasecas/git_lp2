package com.cibertec.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Reservas;
import com.cibertec.repositorio.ReservasRepository;
@Service
public class ReservasServiceImpl implements ReservasService {

    @Autowired
    private ReservasRepository reservaRepository;

    @Override
    public List<Reservas> obtenerTodasReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Optional<Reservas> obtenerReservaPorId(Integer id) {
        return reservaRepository.findById(id);
    }
    @Override
    public void actualizarEstadoPago(int reservaId) {
        // Lógica para actualizar el estado de pago
    }
}
