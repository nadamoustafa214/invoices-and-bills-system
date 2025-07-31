package com.example.invoiceandbills_system.data.entities;

import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name="receipts")
@Setter
@Getter
public class receipts extends entityBase<Long> {
    @OneToOne
    private payment payment;
    private long paymentId;
    private Date data;
    private String receiptNumber;
}
