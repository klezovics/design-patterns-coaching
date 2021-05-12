package com.klezovich.designpatterns.creational.singleton.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;


@Getter

@AllArgsConstructor
@ConstructorBinding
@ConfigurationProperties(prefix = "api")
public class ApiConfigImmutable {

    private  String id;
    private  String key;
}
