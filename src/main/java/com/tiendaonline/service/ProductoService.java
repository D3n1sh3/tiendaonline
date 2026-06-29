package com.tiendaonline.service;

import com.tiendaonline.DTO.ProductoRequestDTO;
import com.tiendaonline.DTO.ProductoResponseDTO;

import java.util.List;

public interface ProductoService {

    ProductoResponseDTO crearProducto(ProductoRequestDTO request);

    List<ProductoResponseDTO> listarProductos();

    ProductoResponseDTO buscarPorId(Long id);

    ProductoResponseDTO actualizarProducto(Long id, ProductoRequestDTO request);

    ProductoResponseDTO eliminarProducto(Long id);

}