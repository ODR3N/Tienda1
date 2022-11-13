package com.Tienda.controller;

import com.Tienda.domain.Cliente;
import com.Tienda.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/nuevo")
    public String clienteNuevo(Cliente cliente) {
        return "modificarCliente";
    }

    @PostMapping("/cliente/guardar")
    public String clienteGuardar(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/";
    }

    @GetMapping("/cliente/modificar/{idCliente}")
    public String clienteModificar(Cliente cliente,Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente",cliente);
        return "modificarCliente";
    }

    @GetMapping("/cliente/eliminar/{idCliente}")
    public String clienteEliminar(Cliente cliente) {
        clienteService.delete(cliente);        
        return "redirect:/";
    }
}
