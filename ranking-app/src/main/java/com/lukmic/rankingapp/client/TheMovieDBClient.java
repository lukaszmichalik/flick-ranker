package com.lukmic.rankingapp.client;

import com.lukmic.rankingapp.dto.response.MovieResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "themoviedb", url = "https://api.themoviedb.org/3")
public interface TheMovieDBClient {

    @GetMapping("/{mediaType}/{rankingId}")
    ResponseEntity<MovieResponse> getMovie(@PathVariable("rankingId") Long rankingId,
                                           @PathVariable("mediaType") String mediaType,
                                           @RequestParam("api_key") String apiKey);
}
