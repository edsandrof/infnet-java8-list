package com.github.edsandrof.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Subscription {
    private Customer customer;
    private BigDecimal monthlyCost;
    private LocalDateTime begin;
    private LocalDateTime end;

    public Subscription(Customer customer, BigDecimal monthlyCost, LocalDateTime begin, LocalDateTime end) {
        this.customer = customer;
        this.monthlyCost = monthlyCost;
        this.begin = begin;
        this.end = end;
    }

    public Subscription(Customer customer, BigDecimal monthlyCost, LocalDateTime begin) {
        this(customer, monthlyCost, begin, null);
    }

    public Customer getCustomer() {
        return customer;
    }

    public BigDecimal getMonthlyCost() {
        return monthlyCost;
    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}
