package com.geekster.instagram.dao;

import com.geekster.instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
