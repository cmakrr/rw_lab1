package com.example.rw.model.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestTo {

    @NotBlank
    @Size(min = 2, max = 64)
    private String login;
    @NotBlank
    @Size(min = 8, max = 128)
    private String password;
    @NotBlank
    @Size(min = 2, max = 64)
    private String firstName;
    @NotBlank
    @Size(min = 2, max = 64)
    private String lastName;
}
