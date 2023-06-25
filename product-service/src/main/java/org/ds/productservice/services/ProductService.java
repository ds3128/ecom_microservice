package org.ds.productservice.services;

import org.ds.productservice.dto.ProductRequestDTO;
import org.ds.productservice.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);

    List<ProductResponseDTO> getAllProducts();
}
