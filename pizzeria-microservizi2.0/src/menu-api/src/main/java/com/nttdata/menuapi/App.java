package com.nttdata.menuapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages = {"com.nttdata.menuapi"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}