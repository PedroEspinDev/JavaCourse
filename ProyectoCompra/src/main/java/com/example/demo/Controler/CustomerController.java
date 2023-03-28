package com.example.demo.Controler;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/createCustomer/{name}/{lastname}")
    public ResponseEntity<List<Customer>>getCustomer(@PathVariable String name,
                                                     @PathVariable String lastname) {
        return new ResponseEntity<>(customerService.createCustomer(name, lastname), HttpStatus.OK);
    }
}

