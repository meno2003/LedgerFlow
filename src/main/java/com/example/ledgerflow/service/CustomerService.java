package com.example.ledgerflow.service;

import com.example.ledgerflow.entity.Customer;
import com.example.ledgerflow.repository.CustomerRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
private final CustomerRepository customerRepository;

public CustomerService(CustomerRepository customerRepository){

    this.customerRepository = customerRepository;
}

public Customer createCustomer(String firstName, String lastName, String email, String passwordHash){
    Customer customer = new Customer();

    customer.setFirstName(firstName);
    customer.setLastName(lastName);
    customer.setEmail(email);
    customer.setPasswordHash(passwordHash);

    return customerRepository.save(customer);
}
}
