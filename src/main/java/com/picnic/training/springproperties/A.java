package com.picnic.training.springproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.net.URL;

@Component
public class A {

    @Value("${hello.prefix}")
    private String prefix;

    @Value("${hello.suffix}")
    private String suffix;

    @Value("${hello.greeting}")
    private String greeting;

    @Value("${hello.url}")
    private URL url;

    @PostConstruct
    private void init() {
        if(greeting == null || greeting.isBlank()) {
            System.out.println("Warn: greeting should not be empty");
        }
        System.out.println(url.getHost());
    }

}
