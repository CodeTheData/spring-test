package com.github.artemysvdev.scope.config;

import com.github.artemysvdev.scope.bean.ObjectProviderExample;
import com.github.artemysvdev.scope.bean.OrderProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RestaurantApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RestaurantConfig.class);

        OrderProcessor processor = context.getBean(OrderProcessor.class);

        processor.processOrder("Coffe", 9);
    }
}
