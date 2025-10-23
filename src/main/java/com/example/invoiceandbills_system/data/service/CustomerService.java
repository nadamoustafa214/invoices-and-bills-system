package com.example.invoiceandbills_system.data.service;

import com.example.invoiceandbills_system.data.DTOs.CustomerDto;
import com.example.invoiceandbills_system.data.Mappers.CustomerMapper;
import com.example.invoiceandbills_system.data.entities.Customer;
import com.example.invoiceandbills_system.data.repos.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;
    private final CustomerMapper customerMapper;

//    private CustomerDto saveCustomer(CustomerDto customerDto) {
//
//    }
}
