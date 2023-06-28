package com.example.bookstoremanagement.service;

import com.example.bookstoremanagement.domain.Customer;
import com.example.bookstoremanagement.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository repository;
    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
