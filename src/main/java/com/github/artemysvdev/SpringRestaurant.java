package com.github.artemysvdev;

import com.github.artemysvdev.config.RestaurantConfiguration;
import com.github.artemysvdev.model.Barista;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRestaurant {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext manager = new AnnotationConfigApplicationContext(RestaurantConfiguration.class);

        Barista barista = manager.getBean("barista", Barista.class);

        barista.makeCofee();


    }
}
