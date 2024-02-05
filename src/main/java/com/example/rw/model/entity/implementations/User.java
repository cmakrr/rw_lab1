package com.example.rw.model.entity.implementations;


import com.example.rw.model.entity.interfaces.EntityModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User implements EntityModel<Long> {

    @GeneratedValue
    @Id
    private Long id;
    @Column(unique = true)
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user")
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
