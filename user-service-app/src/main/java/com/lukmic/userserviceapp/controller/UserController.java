package com.lukmic.userserviceapp.controller;

import com.lukmic.userserviceapp.dto.request.UserRequest;
import com.lukmic.userserviceapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserRequest userRequest) {

        return userService.createUser(userRequest);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers() {

        return userService.getAllUsers();
    }
}
