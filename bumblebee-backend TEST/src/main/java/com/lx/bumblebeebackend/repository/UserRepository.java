package com.lx.bumblebeebackend.repository;

import com.lx.bumblebeebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
