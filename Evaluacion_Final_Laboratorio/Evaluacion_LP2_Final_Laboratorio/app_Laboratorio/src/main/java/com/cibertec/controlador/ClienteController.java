package com.cibertec.controlador;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cibertec.servicio.ClienteService;

public class ClienteController {
	private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteService.obtenerTodosClientes());
        return "clientes/lista";
    }

    @GetMapping("/clientes/{id}")
    public String verCliente(@PathVariable Integer id, Model model) {
        clienteService.obtenerClientePorId(id).ifPresent(cliente -> model.addAttribute("cliente", cliente));
        return "clientes/detalle";
    }

}
