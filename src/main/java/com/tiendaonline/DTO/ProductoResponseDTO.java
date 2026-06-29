package com.tiendaonline.DTO;

import lombok.Builder;

@Builder
public record ProductoResponseDTO(
        Long id_producto,
        String nombre,
        Integer stock
) {
}
