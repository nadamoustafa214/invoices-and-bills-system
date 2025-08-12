package com.example.invoiceandbills_system.data.DTOs;

import com.example.invoiceandbills_system.base.DtoBase;

public class productDto extends DtoBase<Long> {
     private String name;
     private String description;
     private double price;
     private boolean active;
     private double taxRate;
     private double discount;
}
