package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.PaymentDto;
import com.example.invoiceandbills_system.data.entities.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PaymentMapper extends mapperBase<Payment, PaymentDto> {
    @Override
    @Mappings({@Mapping(source = "date",target = "payment_date"),
    @Mapping(source = "typeOfPayment",target = "payment_type")})
    PaymentDto fromEntity(Payment payment);

    @Override
    @Mappings({@Mapping(source = "payment_date",target = "date"),
    @Mapping(source = "payment_type",target = "typeOfPayment")})
    Payment fromDTO(PaymentDto paymentDto);
}
