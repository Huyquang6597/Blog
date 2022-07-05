package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.model.Role;

public interface PostService {
    Iterable<Post> findAll();

    void save(Post post);

    void delete(Long id);

    Iterable<Post> findByAuthorName(String name);

    Iterable<Post> findByAuthorId(Long id);
}
