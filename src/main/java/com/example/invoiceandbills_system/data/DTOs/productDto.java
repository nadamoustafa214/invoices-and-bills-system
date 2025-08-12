package com.example.invoiceandbills_system.data.DTOs;

import com.example.invoiceandbills_system.base.DtoBase;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class productDto extends DtoBase<Long> {
     private String name;
     private String description;
     private double price;
     private boolean active;
     private double tax_rate;
     private double discount;
}
