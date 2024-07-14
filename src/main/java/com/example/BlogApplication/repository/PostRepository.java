package com.example.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlogApplication.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
