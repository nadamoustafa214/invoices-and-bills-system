package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.paymentDto;
import com.example.invoiceandbills_system.data.entities.payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface paymentMapper extends mapperBase<payment, paymentDto> {
    @Override
    @Mappings({@Mapping(source = "date",target = "payment_date"),
    @Mapping(source = "typeOfPayment",target = "payment_type")})
    paymentDto fromEntity(payment payment);

    @Override
    @Mappings({@Mapping(source = "payment_date",target = "date"),
    @Mapping(source = "payment_type",target = "typeOfPayment")})
    payment fromDTO(paymentDto paymentDto);
}
