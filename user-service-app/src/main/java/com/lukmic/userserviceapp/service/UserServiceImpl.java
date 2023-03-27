package com.lukmic.userserviceapp.service;

import com.lukmic.userserviceapp.dto.request.UserRequest;
import com.lukmic.userserviceapp.dto.response.MessageResponse;
import com.lukmic.userserviceapp.dto.response.UserResponse;
import com.lukmic.userserviceapp.model.User;
import com.lukmic.userserviceapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<MessageResponse> createUser(UserRequest userRequest) {
        userRepository.save(new User(userRequest));

        return ResponseEntity.ok(new MessageResponse("User successfully created!"));
    }

    @Override
    public ResponseEntity<List<UserResponse>> getAllUsers() {

        List<UserResponse> users = userRepository.findAll().stream()
                .map(user -> new UserResponse(user.getName(), user.getUsername(), user.getDob()))
                .toList();

        return ResponseEntity.ok(users);
    }
}
