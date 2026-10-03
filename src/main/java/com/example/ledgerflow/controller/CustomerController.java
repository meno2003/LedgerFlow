package com.example.ledgerflow.controller;

import com.example.ledgerflow.entity.Customer;
import com.example.ledgerflow.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
