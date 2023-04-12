package com.lukmic.rankingapp.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("tmdb")
public record TheMovieDBConfigProperties(String apiUrl, String apiVersion, String apiKey) {
}
