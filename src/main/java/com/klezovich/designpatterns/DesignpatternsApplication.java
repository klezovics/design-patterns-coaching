package com.klezovich.designpatterns;

import com.klezovich.designpatterns.creational.singleton.config.ApiConfig;
import com.klezovich.designpatterns.creational.singleton.config.ApiConfigImmutable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ApiConfig.class, ApiConfigImmutable.class})
public class DesignpatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternsApplication.class, args);
    }

}
