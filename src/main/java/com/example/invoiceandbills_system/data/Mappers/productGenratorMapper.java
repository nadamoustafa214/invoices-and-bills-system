package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.api.v1.generated.model.ProductRequest;
import com.example.invoiceandbills_system.api.v1.generated.model.ProductResponse;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.ProductDto;
import com.example.invoiceandbills_system.data.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface productGenratorMapper {

      Product fromProductRequest(ProductRequest productRequest);
      ProductResponse fromProduct(Product product);
       @Mappings({@Mapping(source = "name",target = "productName"),
       @Mapping(source = "tax_rate",target = "taxRate")})
      ProductResponse fromProductDto(ProductDto productDto);
       List<ProductResponse>  fromProductResponse(List<Product> products);



}
