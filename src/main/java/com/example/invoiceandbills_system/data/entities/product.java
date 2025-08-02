package com.example.invoiceandbills_system.data.entities;

import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Setter
@Getter
public class product extends entityBase<Long> {
    @Column(nullable=false,unique = true)
    private String productName;
    private String description;
    @Column(nullable=false)
    private Double price;
    private boolean active=true;
    private double taxRate;
    private double discount;

}
