package com.example.invoiceandbills_system.base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Setter
@Getter
public class entityBase <ID extends Number> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public ID id;
    @Timestamp
    public Date created_at;
    @Timestamp
    public Date updated_at;
    @Timestamp
    public Date deleted_at;
    public boolean is_deleted = false;
}
