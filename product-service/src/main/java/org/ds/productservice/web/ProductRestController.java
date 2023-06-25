package org.ds.productservice.web;

import lombok.RequiredArgsConstructor;
import org.ds.productservice.dto.ProductRequestDTO;
import org.ds.productservice.dto.ProductResponseDTO;
import org.ds.productservice.services.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductServiceImpl productService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductResponseDTO createProduct(@RequestBody ProductRequestDTO productRequestDTO){
        return this.productService.createProduct(productRequestDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDTO> getAllProduct(){
        return productService.getAllProducts();
    }
}
