package com.example.invoiceandbills_system.data.repos;

import com.example.invoiceandbills_system.data.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepo extends JpaRepository<Product,Long> {

    @Modifying
    @Query(value = "UPDATE products SET delete_at=now() AND is_deleted= true WHEN id=?",nativeQuery = true)
    void softDeleteById(@Param("id") Long id);
}
