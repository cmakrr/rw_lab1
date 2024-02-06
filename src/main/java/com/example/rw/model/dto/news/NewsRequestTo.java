package com.example.rw.model.dto.news;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewsRequestTo {

    private String title;
    private String content;
    private Long userId;
    private List<Long> stickersId;
}
