package com.example.rw.model.entity.implementations;


import com.example.rw.model.entity.interfaces.EntityModel;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class News implements EntityModel<Long> {

    @GeneratedValue
    @Id
    private Long id;
    private String title;
    private String content;
    @CreationTimestamp
    private Date creationDate;
    @UpdateTimestamp
    private Date updateDate;
    private Long userId;
    @ElementCollection
    private List<Long> stickerIdList;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id){
        this.id = id;
    }
}
