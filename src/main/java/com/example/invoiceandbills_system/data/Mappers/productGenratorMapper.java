package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.api.v1.generated.model.ProductRequest;
import com.example.invoiceandbills_system.api.v1.generated.model.ProductResponse;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.entities.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface productGenratorMapper {

Product fromProductRequest(ProductRequest productRequest);

//ProductRequest fromProduct(Product product);

ProductResponse fromProduct(Product product);

 List<ProductResponse>  fromProductResponse(List<Product> products);

}
