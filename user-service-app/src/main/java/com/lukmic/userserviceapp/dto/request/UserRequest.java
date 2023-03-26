package com.lukmic.userserviceapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserRequest {

    private String name;
    private String username;
    private Date dob;

}
