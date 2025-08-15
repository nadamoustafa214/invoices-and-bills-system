package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.InvoiceItemDto;
import com.example.invoiceandbills_system.data.entities.InvoiceItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring",uses = {PaymentMapper.class})
public interface InvoiceItemMapper extends mapperBase<InvoiceItem, InvoiceItemDto> {
    @Mappings({@Mapping(source = "unitPrice",target = "unit_price"),
    @Mapping(source = "taxRate",target = "tax"),
    @Mapping(source = "totalPrice",target = "total_price"),
    @Mapping(source = "product",    target = "products") })
    InvoiceItemDto fromEntity(InvoiceItem invoice);

    @Mappings({@Mapping(source = "unit_price",target = "unitPrice"),
    @Mapping(source = "tax",target = "taxRate"),
    @Mapping(source = "total_price",target = "totalPrice"),
    @Mapping(source = "products",    target = "product") })
    InvoiceItem fromDTO(InvoiceItemDto invoiceItemDto);
}
