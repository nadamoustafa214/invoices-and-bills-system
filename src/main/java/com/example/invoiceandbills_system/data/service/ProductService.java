package com.example.invoiceandbills_system.data.service;

import com.example.invoiceandbills_system.data.DTOs.ProductDto;
import com.example.invoiceandbills_system.data.Mappers.ProductMapper;
import com.example.invoiceandbills_system.data.entities.Product;
import com.example.invoiceandbills_system.data.repos.ProductRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
   private final ProductRepo productRepo;
   private ProductMapper productMapper;

   @Transactional
   public ProductDto saveProduct(ProductDto product) {
      return productMapper.fromEntity( productRepo.save( productMapper.fromDTO(product)));
   }

   @Transactional(readOnly = true)
   public List<ProductDto> getProducts() {
       return productMapper.fromEntityList(productRepo.findAll());
   }

   @Transactional
   public ProductDto updateProduct(Long id,ProductDto productDto) {
         Product product= productRepo.findById(productDto.getId()).orElseThrow(null);
//         if(product.getIs_deleted==true){
//             throw  new RuntimeException("Product not found");
//         }
        return productMapper.fromEntity(productRepo.save( productMapper.fromDTO(productDto)));
   }

   @Transactional(readOnly = true)
   public ProductDto getProductById(Long id) {
      Product product= productRepo.findById(id).orElseThrow(null);
      if(product == null || product.getDeleted_at()!=null) {
          throw new RuntimeException("Product not found");
      }
       return productMapper.fromEntity(product);
   }

   @Transactional
   public void  deleteProduct(Long id) {
        productRepo.softDeleteById(id);
    }

}
