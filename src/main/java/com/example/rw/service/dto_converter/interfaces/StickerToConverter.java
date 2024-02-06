package com.example.rw.service.dto_converter.interfaces;

import com.example.rw.model.dto.sticker.StickerRequestTo;
import com.example.rw.model.dto.sticker.StickerResponseTo;
import com.example.rw.model.entity.implementations.Sticker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StickerToConverter extends ToConverter<Sticker, StickerRequestTo, StickerResponseTo>{
}
