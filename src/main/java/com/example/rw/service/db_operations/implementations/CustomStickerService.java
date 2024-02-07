package com.example.rw.service.db_operations.implementations;

import com.example.rw.exception.model.not_found.EntityNotFoundException;
import com.example.rw.model.entity.implementations.Sticker;
import com.example.rw.repository.interfaces.StickerRepository;
import com.example.rw.service.db_operations.interfaces.StickerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomStickerService implements StickerService {

    private final StickerRepository stickerRepository;

    @Override
    public Sticker findById(Long id) throws EntityNotFoundException {
        return stickerRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    @Override
    public List<Sticker> findAll() {
        return stickerRepository.findAll();
    }

    @Override
    public void save(Sticker entity) {
        stickerRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws EntityNotFoundException {
        boolean wasDeleted = stickerRepository.deleteById(id);
        if(!wasDeleted){
            throw new EntityNotFoundException(id);
        }
    }
}
