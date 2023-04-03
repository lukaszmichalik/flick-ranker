package com.lukmic.userserviceapp.controller;

import com.lukmic.userserviceapp.dto.request.IdRequest;
import com.lukmic.userserviceapp.dto.request.UserRequest;
import com.lukmic.userserviceapp.dto.response.UserResponse;
import com.lukmic.userserviceapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Long> createUser(@RequestBody UserRequest userRequest) {

        return userService.createUser(userRequest);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserResponse>> getAllUsers() {

        return userService.getAllUsers();
    }

    @GetMapping("/:id")
    public ResponseEntity<UserResponse> getUser(@RequestBody IdRequest idRequest) {

        return userService.getUser(idRequest);
    }
}
