package com.lukmic.userserviceapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserResponse {

    private String name;
    private String username;
    private Date dob;
}
