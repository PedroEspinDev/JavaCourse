package com.example.demo.Repository;

import com.example.demo.Entity.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBase {
    List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomerList(Customer customer) {
        customers.add(customer);
        return customers;
    }
}

