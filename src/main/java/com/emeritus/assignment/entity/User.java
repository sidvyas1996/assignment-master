package com.emeritus.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor

public class User {

    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String roles;

    public User(String username, String password, String roles)
    {
        this.username=username;
        this.password=password;
        this.roles=roles;
    }

}
