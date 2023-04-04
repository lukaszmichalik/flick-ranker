package com.lukmic.userapp.service;

import com.lukmic.userapp.dto.request.IdRequest;
import com.lukmic.userapp.dto.request.UserRequest;
import com.lukmic.userapp.dto.response.UserResponse;
import com.lukmic.userapp.exception.NotFoundException;
import com.lukmic.userapp.model.User;
import com.lukmic.userapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<Long> createUser(UserRequest userRequest) {

        User user = new User(userRequest);
        userRepository.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(user.getId());
    }

    @Override
    public ResponseEntity<List<UserResponse>> getAllUsers() {

        List<UserResponse> users = userRepository.findAll().stream()
                .map(UserResponse::new)
                .toList();

        return ResponseEntity.ok(users);
    }

    @Override
    public ResponseEntity<UserResponse> getUser(IdRequest idRequest) {
        User user = userRepository.findById(idRequest.getId())
                .orElseThrow(() -> new NotFoundException("User not found with id: " + idRequest.getId()));


        return ResponseEntity.ok(new UserResponse(user));
    }
}
