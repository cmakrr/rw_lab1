package com.example.rw.controller;

import com.example.rw.model.dto.sticker.StickerRequestTo;
import com.example.rw.model.dto.sticker.StickerResponseTo;
import com.example.rw.model.dto.user.UserRequestTo;
import com.example.rw.model.dto.user.UserResponseTo;
import com.example.rw.model.entity.implementations.Sticker;
import com.example.rw.model.entity.implementations.User;
import com.example.rw.service.db_operations.interfaces.StickerService;
import com.example.rw.service.dto_converter.interfaces.StickerToConverter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${api.request.prefix}/sticker")
@RequiredArgsConstructor
public class StickerController {

    private final StickerService stickerService;
    private final StickerToConverter stickerToConverter;

    @PostMapping("/create")
    public ResponseEntity<StickerResponseTo> createSticker(@RequestBody @Valid StickerRequestTo stickerRequestTo){
        Sticker sticker = stickerToConverter.convertToEntity(stickerRequestTo);
        stickerService.save(sticker);
        StickerResponseTo stickerResponseTo = stickerToConverter.convertToDto(sticker);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(stickerResponseTo);
    }

    @GetMapping("/list")
    public ResponseEntity<List<StickerResponseTo>> receiveAllStickers() {
        List<Sticker> stickers = stickerService.findAll();
        List<StickerResponseTo> responseList = stickers.stream()
                .map(stickerToConverter::convertToDto)
                .toList();
        return ResponseEntity.ok(responseList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StickerResponseTo> receiveStickerById(@PathVariable Long id) {
        Sticker sticker = stickerService.findById(id);
        StickerResponseTo stickerResponseTo = stickerToConverter.convertToDto(sticker);
        return ResponseEntity.ok(stickerResponseTo);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<StickerResponseTo> updateSticker(@PathVariable Long id, @RequestBody @Valid StickerRequestTo stickerRequestTo) {
        Sticker sticker = stickerToConverter.convertToEntity(stickerRequestTo);
        sticker.setId(id);
        stickerService.save(sticker);
        StickerResponseTo stickerResponseTo = stickerToConverter.convertToDto(sticker);
        return ResponseEntity.ok(stickerResponseTo);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStickerById(@PathVariable Long id) {
        stickerService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
