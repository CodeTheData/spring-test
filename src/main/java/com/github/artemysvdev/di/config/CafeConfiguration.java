package com.github.artemysvdev.di.config;

import com.github.artemysvdev.di.bean.Kitchen;
import com.github.artemysvdev.di.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.artemysvdev.di")
public class CafeConfiguration {

    @Bean
    public Waiter waiter(Kitchen kitchen) {
        return new Waiter(kitchen);
    }

}
