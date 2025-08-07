package com.example.invoiceandbills_system.data.entities;

import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "invoices")
@Setter
@Getter
public class invoice extends entityBase<Long> {
    @Column(nullable = false, unique = true,name = "invoice_number")
    private String invoiceNumber;
    @Timestamp
    @Column(nullable=false,name="invoice_date")
    private Date invoiceDate;
    @Column(name="due_date")
    private Date dueDate; // for deadline for payment
    @Column(nullable=false)
    private double subtotal;
    @Column(nullable=false)
    private double total;
    @Column(nullable=false)
    private String status;
    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false, insertable=false, updatable=false)
    private customer customer;
    @Column(name="customer_id",nullable = false)
    private long customerId;
    private String notes;
    private String currency;
}
