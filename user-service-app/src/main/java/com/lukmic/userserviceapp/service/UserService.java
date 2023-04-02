package com.lukmic.userserviceapp.service;

import com.lukmic.userserviceapp.dto.request.IdRequest;
import com.lukmic.userserviceapp.dto.request.UserRequest;
import com.lukmic.userserviceapp.dto.response.MessageResponse;
import com.lukmic.userserviceapp.dto.response.UserResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<MessageResponse> createUser(UserRequest userRequest);
    ResponseEntity<List<UserResponse>> getAllUsers();
    ResponseEntity<UserResponse> getUser(IdRequest idRequest);
}
