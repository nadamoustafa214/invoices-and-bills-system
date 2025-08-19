package com.example.invoiceandbills_system.api.v1.controller;

import com.example.invoiceandbills_system.api.v1.generated.ProductApi;
import com.example.invoiceandbills_system.data.DTOs.ProductDto;
import com.example.invoiceandbills_system.data.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
public class ProductController implements ProductApi {
    private final ProductService productService;

    @Override
    public ResponseEntity<ProductDto> getProductById(Long productId) {
        if (productId == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productService.getProductById(productId));
    }

    public ResponseEntity<List<ProductDto>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }

    public ResponseEntity<ProductDto> updateProduct(ProductDto productDto,long productId) {
        if (productDto == null||productDto.getId()!=productId) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(productService.updateProduct(productId, productDto));
    }
    public ResponseEntity<ProductDto> saveProduct(ProductDto productDto) {
        if (productDto == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(productService.saveProduct(productDto));
    }
}
