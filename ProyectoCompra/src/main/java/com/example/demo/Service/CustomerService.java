package com.example.demo.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private DataBase dataBase;


    public List<Customer> createCustomer(String name, String lastName) {
        Customer customer = new Customer(name, lastName);
        return dataBase.getCustomerList(customer);
    }
}

