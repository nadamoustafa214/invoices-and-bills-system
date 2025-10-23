package com.example.invoiceandbills_system.data.repos;

import com.example.invoiceandbills_system.data.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
