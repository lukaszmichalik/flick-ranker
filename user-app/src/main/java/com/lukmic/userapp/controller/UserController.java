package com.lukmic.userapp.controller;

import com.lukmic.userapp.dto.request.IdRequest;
import com.lukmic.userapp.dto.request.UserRequest;
import com.lukmic.userapp.dto.response.UserResponse;
import com.lukmic.userapp.service.UserService;
import jakarta.validation.Valid;
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
    public ResponseEntity<Long> createUser(@Valid @RequestBody UserRequest userRequest) {

        return userService.createUser(userRequest);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserResponse>> getAllUsers() {

        return userService.getAllUsers();
    }

    @GetMapping("/:id")
    public ResponseEntity<UserResponse> getUser(@Valid @RequestBody IdRequest idRequest) {

        return userService.getUser(idRequest);
    }
}
