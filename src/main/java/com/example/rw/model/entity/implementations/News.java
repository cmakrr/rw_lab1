package com.example.rw.model.entity.implementations;


import com.example.rw.model.entity.interfaces.EntityModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Data
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
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "news")
    private List<Message> messages;
    @ManyToMany(mappedBy = "newsList")
    private List<Sticker> stickers;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id){
        this.id = id;
    }
}
