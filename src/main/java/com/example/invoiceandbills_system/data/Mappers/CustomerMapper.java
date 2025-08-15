package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.CustomerDto;
import com.example.invoiceandbills_system.data.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends mapperBase<Customer, CustomerDto> {
    @Override
    Customer fromDTO(CustomerDto dto);
    @Override
    CustomerDto fromEntity(Customer entity);

}
