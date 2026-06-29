package com.tiendaonline.service;

import com.tiendaonline.DTO.ProductoRequestDTO;
import com.tiendaonline.DTO.ProductoResponseDTO;
import com.tiendaonline.mapper.ProductoMapper;
import com.tiendaonline.model.Producto;
import com.tiendaonline.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repository;
    private final ProductoMapper mapper;

    @Override
    public ProductoResponseDTO crearProducto(ProductoRequestDTO request) {
        Producto producto = mapper.toModel(request);
        repository.save(producto);
        return mapper.toDTO(producto);
    }

    @Override
    public List<ProductoResponseDTO> listarProductos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public ProductoResponseDTO buscarPorId(Long id) {
        Producto producto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return mapper.toDTO(producto);
    }

    @Override
    public ProductoResponseDTO actualizarProducto(Long id, ProductoRequestDTO request) {

        Producto producto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        producto.setNombre(request.nombre());
        producto.setDescripcion(request.descripcion());
        producto.setPrecio(request.precio());
        producto.setStock(request.stock());
        producto.setCategoria(request.categoria());

        repository.save(producto);

        return mapper.toDTO(producto);
    }


    @Override
    public ProductoResponseDTO eliminarProducto(Long id) {
        Producto producto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        repository.delete(producto);
        return mapper.toDTO(producto);
    }
}