package com.picnic.training.springproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.URL;

@Component
public class B {

   @Autowired
   private AppConfig appConfig;

    @PostConstruct
    private void init() {
        if(appConfig.getGreeting() == null || appConfig.getGreeting().isBlank()) {
            System.out.println("Warn: greeting should not be empty");
        }
        System.out.println(appConfig.getUrl().getHost());
    }

}
