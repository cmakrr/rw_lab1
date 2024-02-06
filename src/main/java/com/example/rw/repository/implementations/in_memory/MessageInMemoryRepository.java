package com.example.rw.repository.implementations.in_memory;

import com.example.rw.model.entity.implementations.Message;
import org.springframework.stereotype.Repository;

@Repository
public class MessageInMemoryRepository extends InMemoryRepositoryWithLongId<Message> {
}
