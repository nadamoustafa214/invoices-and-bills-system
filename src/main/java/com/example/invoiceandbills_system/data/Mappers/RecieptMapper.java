package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.ReceiptDto;
import com.example.invoiceandbills_system.data.entities.Receipt;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RecieptMapper extends mapperBase<Receipt, ReceiptDto> {
    @Override
    @Mappings({@Mapping(source = "receiptNumber",target = "receipt_number"),
    @Mapping(source = "date",target = "receipt_date")})
    ReceiptDto fromEntity(Receipt entity);

    @Override
    @Mappings({@Mapping(source = "receipt_number",target = "receiptNumber"),
    @Mapping(source = "receipt_date",target = "date")})
    Receipt fromDTO(ReceiptDto dto);

}
