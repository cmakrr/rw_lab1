package com.example.rw.service.dto_converter.interfaces;

import com.example.rw.model.dto.news.NewsRequestTo;
import com.example.rw.model.dto.news.NewsResponseTo;
import com.example.rw.model.entity.implementations.News;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsToConverter extends ToConverter<News, NewsRequestTo, NewsResponseTo> {
}
