package com.example.ledgerflow.controller;

import com.example.ledgerflow.entity.Customer;
import com.example.ledgerflow.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {


        private final CustomerService customerService;

        public CustomerController (CustomerService customerService){
            this.customerService = customerService;
        }

        @PostMapping
        public Customer createCustomer(
                @RequestParam String firstName,
                @RequestParam String lastName,
                @RequestParam String email,
                @RequestParam String passwordHash

        ){
            return customerService.createCustomer(firstName,lastName,email,passwordHash);
        }
        @GetMapping
    public List<Customer> getAllCustomers() {
            return customerService.getAllCustomers();
        }


}
