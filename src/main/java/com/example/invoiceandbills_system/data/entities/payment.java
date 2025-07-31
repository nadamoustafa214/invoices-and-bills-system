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
    private invoice invoice;
    private long invoiceId;
    @Column(nullable=false)
    private double amount;
    @Column(nullable=false)
    private String status; // will add from enum
    @Column(nullable=false)
    private Date date;
    @Column(nullable=false)
    private String type_of_payment; // will add from enum
    private long transactionId; // from gateway

}
