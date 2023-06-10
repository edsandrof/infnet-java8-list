package com.github.edsandrof.model;

import java.time.LocalDateTime;
import java.util.List;

public class Payment {
    private List<Product> products;
    private Customer customer;
    private LocalDateTime purchaseDate;

    public Payment(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
        this.purchaseDate = LocalDateTime.now();
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }
}
