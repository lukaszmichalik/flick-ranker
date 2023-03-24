package com.lukmic.userserviceapp.service;

import com.lukmic.userserviceapp.DTO.UserRequest;
import com.lukmic.userserviceapp.model.User;
import com.lukmic.userserviceapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<?> createUser(UserRequest userRequest) {
        userRepository.save(new User(userRequest));

        return ResponseEntity.ok("Saved User");
    }
}
