package com.lukmic.rankingapp;

import com.lukmic.rankingapp.configuration.TheMovieDBConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TheMovieDBConfigProperties.class)
public class RankingApp {

    public static void main(String[] args) {
        SpringApplication.run(RankingApp.class, args);
    }

}
