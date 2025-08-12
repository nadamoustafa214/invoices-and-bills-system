package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.customerDto;
import com.example.invoiceandbills_system.data.entities.customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface    customerMapper extends mapperBase<customer, customerDto> {
    @Override
    customer fromDTO(customerDto dto);
    @Override
    customerDto fromEntity(customer entity);

}
