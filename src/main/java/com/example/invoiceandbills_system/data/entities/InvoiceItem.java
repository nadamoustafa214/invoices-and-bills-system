package com.example.invoiceandbills_system.data.entities;
import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="invoice_items")
@Setter
@Getter
public class InvoiceItem extends entityBase<Long> {
    @OneToOne
    @JoinColumn(name="invoice_id", nullable = false, updatable = false, insertable = false)
    private Invoice invoice;
    @Column(nullable = false,name = "invoice_id")
    private long invoiceId;
    @ManyToMany
    private List<Product> product;
    @Column(nullable=false,name="unit_price")
    private double unitPrice;
    @Column(nullable=false)
    private int quantity;
    @Column(name="tax_rate")
    private double taxRate;
    @Column(nullable=false,name="total_price")
    private double totalPrice;


}
