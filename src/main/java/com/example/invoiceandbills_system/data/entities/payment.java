package com.example.invoiceandbills_system.data.entities;

import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="payments")
@Setter
@Getter
public class payment extends entityBase<Long> {
    @OneToOne
    @JoinColumn(name="invoice_id",nullable = false,insertable = false, updatable = false)
    private invoice invoice;
    @Column(nullable=false,name = "invoice_id")
    private long invoiceId;
    @Column(nullable=false)
    private double amount;
    @Column(nullable=false)
    private String status; // will add from enum
    @Column(nullable=false)
    private Date date;
    @Column(nullable=false ,name = "type_of_payment")
    private String typeOfPayment; // will add from enum
    @Column(name = "transaction_id")
    private long transactionId; // from gateway

}
