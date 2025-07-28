package com.example.invoiceandbills_system.data.entities;

import com.example.invoiceandbills_system.base.entityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customers")
@Setter
@Getter
public class customer extends entityBase<Long> {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String phone;
    private String address;
    @Column(nullable = false)
    private String city;

}

// tax ber city