package com.lukmic.userserviceapp.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserRequest {

    private String name;
    private String username;
    private Date dob;

}
