package com.example.rw.model.dto.message;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequestTo {

    @Size(min = 2, max = 2048)
    private String content;
    private Long newsId;
}
