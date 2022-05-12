package com.postgres.sampleproject.Service;

import com.postgres.sampleproject.Model.Customer;
import com.postgres.sampleproject.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer enterCustomer( Customer customer){
        return customerRepository.save(customer);
    }
}

