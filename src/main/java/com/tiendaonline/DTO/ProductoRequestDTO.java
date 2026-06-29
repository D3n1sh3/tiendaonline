package com.tiendaonline.DTO;

public record ProductoRequestDTO(
        String nombre,
        String descripcion,
        Double precio,
        Integer stock,
        String categoria
) {

}