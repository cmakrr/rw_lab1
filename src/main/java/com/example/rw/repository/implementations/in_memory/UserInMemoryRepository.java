package com.example.rw.repository.implementations.in_memory;

import com.example.rw.model.entity.implementations.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserInMemoryRepository extends InMemoryRepositoryWithLongId<User> {
}
