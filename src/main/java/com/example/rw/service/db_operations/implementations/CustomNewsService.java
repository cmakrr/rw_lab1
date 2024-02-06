package com.example.rw.service.db_operations.implementations;

import com.example.rw.exception.not_found.EntityNotFoundException;
import com.example.rw.model.entity.implementations.News;
import com.example.rw.repository.interfaces.NewsRepository;
import com.example.rw.service.db_operations.interfaces.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomNewsService implements NewsService {

    private final NewsRepository newsRepository;

    @Override
    public News findById(Long id) throws EntityNotFoundException {
        return newsRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    @Override
    public List<News> findAll() {
        return newsRepository.findAll();
    }

    @Override
    public void save(News entity) {
        newsRepository.save(entity);
    }

    @Override
    public boolean deleteById(Long id) {
        return newsRepository.deleteById(id);
    }
}
