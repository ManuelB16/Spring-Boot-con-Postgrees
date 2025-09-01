package com.example.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.post.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

