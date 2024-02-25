package com.example.rw.model.entity.implementations;

import com.example.rw.model.entity.interfaces.EntityModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Message implements EntityModel<Long> {

    @GeneratedValue
    @Id
    private Long id;
    private String content;
    private Long newsId;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id){
        this.id = id;
    }
}
