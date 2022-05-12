package com.postgres.sampleproject.Dao;

import com.postgres.sampleproject.Model.Customer;
import com.postgres.sampleproject.Model.User;
import com.postgres.sampleproject.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserToCustomer {
   @Autowired
   CustomerService customerService;
    public Customer buildCustomer(User user){
        Customer customer =new Customer();
        customer.setCustomerName(user.getName());
        customer.setAge(user.getAge());
        customer.setPhoneNumber(user.getContactNumber());
        customer.setAddress(user.getAddress());
        return customerService.enterCustomer(customer);
    }

}
