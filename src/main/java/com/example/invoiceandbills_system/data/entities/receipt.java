package com.example.invoiceandbills_system.data.entities;

import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name="receipts")
@Setter
@Getter
public class receipt extends entityBase<Long> {
    @OneToOne
    @JoinColumn(name = "payment_id",nullable = false,updatable = false,insertable = false)
    private payment payment;
    @Column(name = "payment_id",nullable = false)
    private long paymentId;
    private Date date;
    @Column(nullable = false,unique = true,name = "receipt_number")
    private String receiptNumber;
}
