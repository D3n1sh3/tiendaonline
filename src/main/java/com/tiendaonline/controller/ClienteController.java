package com.tiendaonline.controller;

import com.tiendaonline.DTO.ClienteRequestDTO;
import com.tiendaonline.DTO.ClienteResponseDTO;
import com.tiendaonline.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public ClienteResponseDTO crearCliente(@RequestBody ClienteRequestDTO request) {
        return service.crearCliente(request);
    }

    @GetMapping
    public List<ClienteResponseDTO> obtenerClientes() {
        return service.obtenerClientes();
    }

    @GetMapping("/{id}")
    public ClienteResponseDTO clienteById(@PathVariable Long id) {
        return service.clienteById(id);
    }

    @PutMapping("/{id}")
    public ClienteResponseDTO actualizarCliente(@PathVariable Long id,
                                                @RequestBody ClienteRequestDTO request) {
        return service.actualizarCliente(id, request);
    }

    @DeleteMapping("/{id}")
    public ClienteResponseDTO eliminarCliente(@PathVariable Long id) {
        return service.eliminarCliente(id);
    }
}