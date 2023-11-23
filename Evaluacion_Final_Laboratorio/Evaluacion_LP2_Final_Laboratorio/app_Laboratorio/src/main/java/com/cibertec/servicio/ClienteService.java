package com.cibertec.servicio;

import java.util.List;
import java.util.Optional;

import com.cibertec.modelo.Cliente;

public interface ClienteService {
	List<Cliente> obtenerTodosClientes();
    Optional<Cliente> obtenerClientePorId(Integer id);

}
