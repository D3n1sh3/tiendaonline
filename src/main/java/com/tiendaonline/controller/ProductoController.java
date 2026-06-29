package com.tiendaonline.controller;

import com.tiendaonline.DTO.ProductoRequestDTO;
import com.tiendaonline.DTO.ProductoResponseDTO;
import com.tiendaonline.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService service;

    @PostMapping
    public ProductoResponseDTO crearProducto(@RequestBody ProductoRequestDTO request) {
        return service.crearProducto(request);
    }

    @GetMapping
    public List<ProductoResponseDTO> listarProductos() {
        return service.listarProductos();
    }

    @GetMapping("/{id}")
    public ProductoResponseDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public ProductoResponseDTO actualizarProducto(
            @PathVariable Long id,
            @RequestBody ProductoRequestDTO request) {
        return service.actualizarProducto(id, request);
    }

    @DeleteMapping("/{id}")
    public ProductoResponseDTO eliminarProducto(@PathVariable Long id) {
        return service.eliminarProducto(id);
    }
}