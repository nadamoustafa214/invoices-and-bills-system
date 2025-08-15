package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.ProductDto;
import com.example.invoiceandbills_system.data.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper extends mapperBase<Product, ProductDto> {
    @Override
   @Mappings({ @Mapping(source = "productName",target = "name"),
   @Mapping(source = "taxRate",target = "tax_rate")})
    ProductDto fromEntity(Product product);

    @Override
  @Mappings({@Mapping(source = "name",target = "productName"),
  @Mapping(source = "tax_rate",target = "taxRate")})
    Product fromDTO(ProductDto productDto);

    @Override
    List<ProductDto> fromEntityList(List<Product>  productList);

    @Override
    List<Product> fromDTOList(List<ProductDto> productDtoList);


}
