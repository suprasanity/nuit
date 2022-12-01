package com.example.dashboard;

import com.example.dashboard.Discord.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class WebsiteApplication {

@Autowired
    Bot bot;
    public static void main(String[] args) {

        SpringApplication.run(WebsiteApplication.class, args);


    }

}
