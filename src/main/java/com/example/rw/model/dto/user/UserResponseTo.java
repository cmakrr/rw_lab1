package com.example.rw.model.dto.user;

import com.example.rw.model.entity.implementations.News;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseTo {

    private String login;
    private String firstName;
    private String lastName;
    private List<Long> newsId;
}
