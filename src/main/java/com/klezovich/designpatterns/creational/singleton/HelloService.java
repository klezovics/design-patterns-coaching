package com.klezovich.designpatterns.creational.singleton;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private final HelloComponent component;

    public HelloService(HelloComponent component) {
        this.component = component;
    }

    public String getHello() {
        return component.getHello();
    }
}
