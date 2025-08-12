package com.example.invoiceandbills_system.base;

public interface mapperBase <E,D>{
    E fromDTO(D dto);
    D fromEntity(E entity);
}
