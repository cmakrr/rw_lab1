package com.example.rw.model.entity.implementations;

import com.example.rw.model.entity.interfaces.EntityModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Sticker implements EntityModel<Long> {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    @ManyToMany
    private List<News> newsList;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id){
        this.id = id;
    }
}
