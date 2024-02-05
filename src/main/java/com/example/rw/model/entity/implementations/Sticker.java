package com.example.rw.model.entity.implementations;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Sticker {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    @ManyToMany
    private List<News> newsList;
}
