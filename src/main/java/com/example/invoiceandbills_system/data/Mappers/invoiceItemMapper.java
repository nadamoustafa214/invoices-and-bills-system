package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.invoiceItemDto;
import com.example.invoiceandbills_system.data.entities.invoice;
import com.example.invoiceandbills_system.data.entities.invoiceItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring",uses = {paymentMapper.class})
public interface invoiceItemMapper extends mapperBase<invoiceItem,invoiceItemDto> {
    @Mappings({@Mapping(source = "unitPrice",target = "unit_price"),
    @Mapping(source = "taxRate",target = "tax"),
    @Mapping(source = "totalPrice",target = "total_price"),
    @Mapping(source = "product",    target = "products") })
    invoiceItemDto fromEntity(invoiceItem invoice);

    @Mappings({@Mapping(source = "unit_price",target = "unitPrice"),
    @Mapping(source = "tax",target = "taxRate"),
    @Mapping(source = "total_price",target = "totalPrice"),
    @Mapping(source = "products",    target = "product") })
    invoiceItem fromDTO(invoiceItemDto invoiceItemDto);
}
