package com.geekster.instagram.dao;

import com.geekster.instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post, Integer> {
}
