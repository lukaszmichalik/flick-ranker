package com.lukmic.userapp.model;

import com.lukmic.userapp.dto.request.UserRequest;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "users_db",	name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String username;
    private Date dob;

    public User(String name, String email, String username, Date dob) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.dob = dob;
    }

    public User(UserRequest userRequest) {
        this.name = userRequest.getName();
        this.email = userRequest.getEmail();
        this.username = userRequest.getUsername();
        this.dob = userRequest.getDob();
    }
}
