package com.github.artemysvdev.di.bean;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private final Waiter waiter;

    public Customer(Waiter waiter) {
        this.waiter = waiter;
    }

    public void makeOrder(String order) {

        System.out.println("Customer makes order: " + order);
        waiter.takeOrder(order);

    }

}
