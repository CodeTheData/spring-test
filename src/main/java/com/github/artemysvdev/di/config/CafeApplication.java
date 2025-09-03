package com.github.artemysvdev.di.config;

import com.github.artemysvdev.di.bean.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CafeApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CafeConfiguration.class);

        Customer customer = context.getBean("customer", Customer.class);

        customer.makeOrder("Salad and Pasta");

    }
}
