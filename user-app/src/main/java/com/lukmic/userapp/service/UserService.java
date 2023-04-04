package com.lukmic.userapp.service;

import com.lukmic.userapp.dto.request.IdRequest;
import com.lukmic.userapp.dto.request.UserRequest;
import com.lukmic.userapp.dto.response.UserResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<Long> createUser(UserRequest userRequest);
    ResponseEntity<List<UserResponse>> getAllUsers();
    ResponseEntity<UserResponse> getUser(IdRequest idRequest);
}
