package com.picnic.training.springproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class A {

    @Value("hello.prefix")
    private String prefix;

    @Value("hello.suffix")
    private String suffix;

    @Value("hello.greeting")
    private String greeting;

    @PostConstruct
    private void init() {
        if(greeting == null || greeting.isBlank()) {
            System.out.println("Warn: greeting should not be empty");
        }
    }

}
