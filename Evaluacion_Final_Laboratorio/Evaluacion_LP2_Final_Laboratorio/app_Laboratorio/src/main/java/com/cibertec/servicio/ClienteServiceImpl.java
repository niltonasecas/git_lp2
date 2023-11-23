package com.cibertec.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Cliente;
import com.cibertec.repositorio.ClienteRepository;
@Service
public class ClienteServiceImpl implements ClienteService {
	 @Autowired
	    private ClienteRepository clienteRepository;

	    @Override
	    public List<Cliente> obtenerTodosClientes() {
	        return clienteRepository.findAll();
	    }

	    @Override
	    public Optional<Cliente> obtenerClientePorId(Integer id) {
	        return clienteRepository.findById(id);
	    }

}
