package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ConfigClientApplication { 

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${yang}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
    @Value("${info.description}")
    String foo2;
    @RequestMapping(value = "/hi2")
    public String hi2(){
        return foo2;
    }
}