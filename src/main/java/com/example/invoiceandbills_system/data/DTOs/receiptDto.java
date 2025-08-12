package com.example.invoiceandbills_system.data.DTOs;

import com.example.invoiceandbills_system.base.DtoBase;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class receiptDto extends DtoBase<Long> {
    private long paymentId;
    private String receipt_number;
    private LocalDateTime receipt_date;
}
