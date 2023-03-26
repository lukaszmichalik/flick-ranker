package com.lukmic.userserviceapp.model;

import com.lukmic.userserviceapp.dto.request.UserRequest;
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

    private String username;

    private Date dob;

    public User(String name, String username, Date dob) {
        this.name = name;
        this.username = username;
        this.dob = dob;
    }

    public User(UserRequest userRequest) {
        this.name = userRequest.getName();
        this.username = userRequest.getUsername();
        this.dob = userRequest.getDob();
    }
}
