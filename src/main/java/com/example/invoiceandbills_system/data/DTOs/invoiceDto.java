package com.example.invoiceandbills_system.data.DTOs;

import com.example.invoiceandbills_system.base.DtoBase;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
public class invoiceDto extends DtoBase<Long> {
    private String invoice_number;
    private LocalDateTime invoice_date;
    private Date due_date;
    private double subtotal;
    private double total;
    private String status;
    private long customerId;
    private String notes;
    private String currency;
}
