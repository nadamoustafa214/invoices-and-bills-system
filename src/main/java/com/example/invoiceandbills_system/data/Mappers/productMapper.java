package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.productDto;
import com.example.invoiceandbills_system.data.entities.product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface productMapper extends mapperBase<product, productDto> {
    @Override
   @Mappings({ @Mapping(source = "productName",target = "name"),
   @Mapping(source = "taxRate",target = "tax_rate")})
    productDto fromEntity(product product);

    @Override
  @Mappings({@Mapping(source = "name",target = "productName"),
  @Mapping(source = "tax_rate",target = "taxRate")})
    product fromDTO(productDto productDto);
}
