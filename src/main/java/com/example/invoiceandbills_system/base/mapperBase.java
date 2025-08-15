package com.example.invoiceandbills_system.base;

import java.util.List;

public interface mapperBase <E,D>{
    E fromDTO(D dto);
    D fromEntity(E entity);
    List<D> fromEntityList(List<E>  entityList);
    List<E> fromDTOList(List<D> dtoList);
}
