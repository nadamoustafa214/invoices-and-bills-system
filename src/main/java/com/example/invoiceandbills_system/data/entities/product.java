package com.example.invoiceandbills_system.data.entities;

import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
public class product extends entityBase<Long> {
    private String productName;
    private String description;
    private Double price;
    private boolean active=true;
    private double taxRate;
}
