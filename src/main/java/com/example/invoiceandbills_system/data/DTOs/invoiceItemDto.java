package com.example.invoiceandbills_system.data.DTOs;

import com.example.invoiceandbills_system.base.DtoBase;

public class invoiceItemDto extends DtoBase<Long> {
    private long invoiceId;
    private double unitPrice;
    private int quantity;
    private double tax;
    private double totalPrice;
}
