package com.tiendaonline.service;

import com.tiendaonline.DTO.ClienteRequestDTO;
import com.tiendaonline.DTO.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {

    ClienteResponseDTO crearCliente(ClienteRequestDTO request);

    List<ClienteResponseDTO> obtenerClientes();

    ClienteResponseDTO clienteById(Long id_cliente);

    ClienteResponseDTO actualizarCliente(Long id_cliente, ClienteRequestDTO request);

    ClienteResponseDTO eliminarCliente(Long id_cliente);
}