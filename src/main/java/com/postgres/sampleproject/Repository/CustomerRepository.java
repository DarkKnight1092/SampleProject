package com.postgres.sampleproject.Repository;

import com.postgres.sampleproject.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Cacheable;
import java.util.List;

@Repository

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
   }
