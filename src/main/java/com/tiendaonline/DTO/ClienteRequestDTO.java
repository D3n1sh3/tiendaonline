package com.tiendaonline.DTO;

public record ClienteRequestDTO(
        String nombre,
        String apellido,
        String correo,
        String telefono,
        String direccion
) {
}