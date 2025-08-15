package com.example.invoiceandbills_system.data.DTOs;

import com.example.invoiceandbills_system.base.DtoBase;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter

public class PaymentDto extends DtoBase<Long> {
    private Long invoiceId;
    private Double amount;
    private String status;
    private LocalDateTime payment_date;
    private String payment_type;
    private long transactionId;
}
