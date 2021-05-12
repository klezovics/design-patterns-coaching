package com.klezovich.designpatterns.creational.singleton;

import org.springframework.stereotype.Component;

@Component
public class HelloComponent {

    public String getHello() {
        return "hello";
    }
}
