package com.example.invoiceandbills_system.data.Mappers;

import com.example.invoiceandbills_system.base.mapperBase;
import com.example.invoiceandbills_system.data.DTOs.InvoiceDto;
import com.example.invoiceandbills_system.data.entities.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface InvoiceMapper extends mapperBase<Invoice, InvoiceDto> {
    @Override
    @Mappings({@Mapping(source = "invoiceNumber",target = "invoice_number"),
    @Mapping(source = "invoiceDate",target = "invoice_date"),
    @Mapping(source = "dueDate",target = "due_date")})
    InvoiceDto fromEntity(Invoice invoice);

    @Override
    @Mappings({@Mapping(source = "invoice_number",target = "invoiceNumber"),
    @Mapping(source = "invoice_date",target = "invoiceDate"),
    @Mapping(source = "due_date",target = "dueDate")})
    Invoice fromDTO(InvoiceDto invoice);
}
