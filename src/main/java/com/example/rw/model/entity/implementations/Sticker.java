package com.example.rw.model.entity.implementations;

import com.example.rw.model.entity.interfaces.EntityModel;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Sticker implements EntityModel<Long> {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    @ElementCollection
    private List<Long> newsIdList;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id){
        this.id = id;
    }
}
