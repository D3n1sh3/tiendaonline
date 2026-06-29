package com.tiendaonline.mapper;

import com.tiendaonline.DTO.ProductoRequestDTO;
import com.tiendaonline.DTO.ProductoResponseDTO;
import com.tiendaonline.model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    public Producto toModel(ProductoRequestDTO request) {
        Producto producto = new Producto();
        producto.setNombre(request.nombre());
        producto.setDescripcion(request.descripcion());
        producto.setPrecio(request.precio());
        producto.setStock(request.stock());
        producto.setCategoria(request.categoria());
        return producto;
    }

    public ProductoResponseDTO toDTO(Producto producto) {
        return ProductoResponseDTO.builder()
                .id_producto(producto.getId_producto())
                .nombre(producto.getNombre())
                .stock(producto.getStock())
                .build();
    }
}