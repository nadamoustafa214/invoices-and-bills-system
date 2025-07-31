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
public class invoiceItem extends entityBase<Long> {
    @OneToOne
    private invoice invoice;
    private long invoiceId;
    @ManyToMany
    private List<product> product;
    @Column(nullable=false)
    private double unitPrice;
    @Column(nullable=false)
    private int quantity;
    private double taxRate;
    @Column(nullable=false)
    private double totalPrice;


}
