package com.github.artemysvdev.scope.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ObjectProviderExample {

    private final ObjectProvider<Waiter> waiterObjectProvider;
    private final ObjectProvider<HeadChef> beanChefObjectProvider;

    public ObjectProviderExample(ObjectProvider<Waiter> waiterObjectProvider, ObjectProvider<HeadChef> beanChefObjectProvider) {
        this.waiterObjectProvider = waiterObjectProvider;
        this.beanChefObjectProvider = beanChefObjectProvider;
    }

    public void getAndCompareChef() {
        HeadChef first = beanChefObjectProvider.getObject();
        HeadChef second = beanChefObjectProvider.getObject();
        System.out.println("HeadChef is equals: " + (first==second));
    }

    public void getAndCompareWaiter() {
        Waiter first = waiterObjectProvider.getObject(UUID.randomUUID());
        Waiter second = waiterObjectProvider.getObject(UUID.randomUUID());
        System.out.println("Waiter is equals: " + (first==second));
    }

}
