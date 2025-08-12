package com.example.invoiceandbills_system.base;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public  abstract class DtoBase<ID> {
    private ID id;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime deleted_at;
    private boolean is_deleted = false;
}
