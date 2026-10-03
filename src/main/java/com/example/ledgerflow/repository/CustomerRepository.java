package com.example.ledgerflow.repository;

import com.example.ledgerflow.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{


}
