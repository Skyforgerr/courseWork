package com.example.work.repositories;

import com.example.work.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ivan 22.12.2022
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
