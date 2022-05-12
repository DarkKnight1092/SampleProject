package com.postgres.sampleproject.Controller;

import com.postgres.sampleproject.Dao.UserToCustomer;
import com.postgres.sampleproject.Model.Customer;
import com.postgres.sampleproject.Model.User;
import com.postgres.sampleproject.Repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    UserToCustomer userToCustomer;
//    public CustomerController(CustomerRepository cust){
//        this.customerRepository=cust;
//    }



    @PostMapping(value ="/addcustomer",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Customer addCustomerC(@RequestBody User user){
        return userToCustomer.buildCustomer(user);
    }

    @GetMapping(value="/getCustomer")
    public Optional<List<Customer>> getCustomers(){
    //Integer i=1;
        return Optional.of(customerRepository.findAll());

    }
    @GetMapping("/")
    public String all(){
        return ("<h1>ALL can Access</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>user can Access</h1>");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>admin can Access<h1>");
    }

}
