package com.example.rw.model.entity.implementations;

import com.example.rw.model.entity.interfaces.EntityModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Message implements EntityModel<Long> {

    @GeneratedValue
    @Id
    private Long id;
    private String content;
    @ManyToOne
    private News news;
}
