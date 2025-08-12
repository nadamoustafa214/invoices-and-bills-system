package com.example.invoiceandbills_system.data.DTOs;

import com.example.invoiceandbills_system.base.DtoBase;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class invoiceItemDto extends DtoBase<Long> {
    private long invoiceId;
    private double unit_price;
    private int quantity;
    private double tax;
    private List<productDto> products;
    private double total_price;
}
