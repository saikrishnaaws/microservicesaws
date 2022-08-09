package com.example.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.boot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
