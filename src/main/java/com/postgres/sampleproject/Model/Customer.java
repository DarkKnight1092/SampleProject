package com.postgres.sampleproject.Model;

import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="CUSTOMER_DET")
public class Customer {

    @Id
    @GeneratedValue
    private Integer customerId;
    private String customerName;
    private Integer age;
    private String phoneNumber;
    private String address;


}
