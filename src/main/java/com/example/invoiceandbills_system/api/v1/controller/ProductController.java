package com.example.invoiceandbills_system.api.v1.controller;

import com.example.invoiceandbills_system.api.v1.generated.ProductsApi;
import com.example.invoiceandbills_system.api.v1.generated.model.ProductRequest;
import com.example.invoiceandbills_system.api.v1.generated.model.ProductResponse;
import com.example.invoiceandbills_system.data.DTOs.ProductDto;
import com.example.invoiceandbills_system.data.Mappers.ProductMapper;
import com.example.invoiceandbills_system.data.Mappers.productGenratorMapper;
import com.example.invoiceandbills_system.data.entities.Product;
import com.example.invoiceandbills_system.data.service.ProductService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/v1")

public class ProductController implements ProductsApi {
    private final ProductService productService;
    private final ProductMapper productMapper;
    private final productGenratorMapper productGenratorMapper;


    //المفروض هترجعلي برودكت ريسبوس وهناك بترجع بفخ
    @Override
    public ResponseEntity<ProductResponse> getProductById( Long id) {
        if (id == null) {
            return ResponseEntity.notFound().build();
        }
       Product product= productMapper.fromDTO(productService.getProductById(id));
        return ResponseEntity.ok(productGenratorMapper.fromProduct(product));
    }

    // مجتاجه ارجع الdto ل entity  ومنها احولها ريسبونس
    @Override
//    @GetMapping("/products")
    public ResponseEntity<List<ProductResponse>> getProducts() {
        List<Product> product = productMapper.fromDTOList(productService.getProducts());
        return ResponseEntity.ok(productGenratorMapper.fromProductResponse(product));
    }
}

//
//@Override
//    public ResponseEntity<ProductResponse> updateProduct(long id, ProductRequest productRequest) {
//        if (productDto == null|| (productDto.getId()!=null && !productDto.getId().equals(id))) {
//            return ResponseEntity.badRequest().build();
//        }
//        return ResponseEntity.ok(productService.updateProduct(id, productDto));
//    }
//
//    public ResponseEntity<ProductDto> saveProduct(ProductDto productDto) {
//        if (productDto == null) {
//            return ResponseEntity.badRequest().build();
//        }
//        return ResponseEntity.ok(productService.saveProduct(productDto));
//    }
//}
