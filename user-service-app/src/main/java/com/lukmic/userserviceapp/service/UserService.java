package com.lukmic.userserviceapp.service;

import com.lukmic.userserviceapp.DTO.UserRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> createUser(UserRequest userRequest);
}
