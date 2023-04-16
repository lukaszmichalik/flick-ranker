package com.lukmic.userapp.dto.response;

import com.lukmic.userapp.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private String username;
    private Date dob;

    public UserResponse (User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.dob = user.getDob();
    }
}
