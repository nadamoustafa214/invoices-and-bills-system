package com.example.invoiceandbills_system.data.DTOs;

import com.example.invoiceandbills_system.base.DtoBase;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class customerDto extends DtoBase<Long> {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
}
