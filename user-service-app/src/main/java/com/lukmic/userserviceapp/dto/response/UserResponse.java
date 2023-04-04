package com.lukmic.userserviceapp.dto.response;

import com.lukmic.userserviceapp.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserResponse {

    private String name;
    private String email;
    private String username;
    private Date dob;

    public UserResponse (User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.dob = user.getDob();
    }
}
