package com.lukmic.commentsapp.client;

import com.lukmic.commentsapp.dto.response.AuthorResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-APP", path = "/api/v1/users")
public interface UserClient {

    @GetMapping("/{id}")
    ResponseEntity<AuthorResponse> getUser(@PathVariable("id") Long id);
}
