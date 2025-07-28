package com.example.invoiceandbills_system.data.entities;

import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "invoices")
@Setter
@Getter
public class invoice extends entityBase<Long> {
    private String invoiceNumber;

}
