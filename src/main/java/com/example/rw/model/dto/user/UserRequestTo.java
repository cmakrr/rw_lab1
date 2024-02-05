package com.example.rw.model.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestTo {

    private String login;
    private String password;
    private String firstName;
    private String lastName;
}
