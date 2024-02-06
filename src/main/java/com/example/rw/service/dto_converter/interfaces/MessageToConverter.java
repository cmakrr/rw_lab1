package com.example.rw.service.dto_converter.interfaces;

import com.example.rw.model.dto.message.MessageRequestTo;
import com.example.rw.model.dto.message.MessageResponseTo;
import com.example.rw.model.entity.implementations.Message;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageToConverter extends ToConverter<Message, MessageRequestTo, MessageResponseTo> {
}
