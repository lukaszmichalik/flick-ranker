package com.lukmic.commentsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CommentsApp {

    public static void main(String[] args) {
        SpringApplication.run(CommentsApp.class, args);
    }

}
