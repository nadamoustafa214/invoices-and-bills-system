package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.receiptDto;
import com.example.invoiceandbills_system.data.entities.receipt;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface recieptMapper extends mapperBase<receipt, receiptDto> {
    @Override
    @Mappings({@Mapping(source = "receiptNumber",target = "receipt_number"),
    @Mapping(source = "date",target = "receipt_date")})
    receiptDto fromEntity(receipt entity);

    @Override
    @Mappings({@Mapping(source = "receipt_number",target = "receiptNumber"),
    @Mapping(source = "receipt_date",target = "date")})
    receipt fromDTO(receiptDto dto);

}
