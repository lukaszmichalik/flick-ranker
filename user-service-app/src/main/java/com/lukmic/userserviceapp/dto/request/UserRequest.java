package com.lukmic.userserviceapp.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class UserRequest {
    @NotNull
    @Size(min = 3, max = 40)
    private String name;
    @NotNull
    @Size(max = 40)
    @Email
    private String email;
    @NotNull
    @Size(min = 3, max = 40)
    private String username;
    private Date dob;
}
