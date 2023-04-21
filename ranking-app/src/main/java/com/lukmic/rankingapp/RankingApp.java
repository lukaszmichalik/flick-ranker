package com.lukmic.rankingapp;

import com.lukmic.rankingapp.configuration.TheMovieDBConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableConfigurationProperties(TheMovieDBConfigProperties.class)
@EnableFeignClients
@EnableDiscoveryClient
public class RankingApp {

    public static void main(String[] args) {
        SpringApplication.run(RankingApp.class, args);
    }

}
