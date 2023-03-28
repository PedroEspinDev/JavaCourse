package com.example.demo.Entity;

import java.util.Date;
import java.util.List;

public class PurchaseOrder {

    private int id;
    private final String description;
    private Date date;
    private Customer customer;
    List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public PurchaseOrder(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getGranTotalPrice() {
        int total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

