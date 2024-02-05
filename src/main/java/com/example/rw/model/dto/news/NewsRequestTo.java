package com.example.rw.model.dto.news;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsRequestTo {

    private String title;
    private String content;
    private Long userId;
}
