package com.lukmic.rankingapp;

import com.lukmic.rankingapp.configuration.RsaKeyProperties;
import com.lukmic.rankingapp.configuration.TheMovieDBConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableConfigurationProperties({TheMovieDBConfigProperties.class, RsaKeyProperties.class})
@EnableFeignClients
public class RankingApp {

    public static void main(String[] args) {
        SpringApplication.run(RankingApp.class, args);
    }

}

