package com.lukmic.userserviceapp.service;

import com.lukmic.userserviceapp.dto.request.UserRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> createUser(UserRequest userRequest);
    ResponseEntity<?> getAllUsers();
}
