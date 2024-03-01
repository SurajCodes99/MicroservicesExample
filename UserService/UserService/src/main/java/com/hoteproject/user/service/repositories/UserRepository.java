package com.hoteproject.user.service.repositories;

import com.hoteproject.user.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
