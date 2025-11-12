package com.example.invoiceandbills_system.api.v1.controller;

import com.example.invoiceandbills_system.api.v1.generated.ProductApi;
import com.example.invoiceandbills_system.data.DTOs.ProductDto;
import com.example.invoiceandbills_system.data.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping
public class ProductController implements ProductApi {
    private final ProductService productService;

//@Override
//    public ResponseEntity<ProductDto> getProductById(Long id) {
//        if (id == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(productService.getProductById(id));
//    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }
//@Override
    public ResponseEntity<ProductDto> updateProduct(long id,ProductDto productDto) {
        if (productDto == null|| (productDto.getId()!=null && !productDto.getId().equals(id))) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(productService.updateProduct(id, productDto));
    }

    public ResponseEntity<ProductDto> saveProduct(ProductDto productDto) {
        if (productDto == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(productService.saveProduct(productDto));
    }
}
