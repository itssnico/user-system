package com.itssnico.usersystem.repository;

import com.itssnico.usersystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}