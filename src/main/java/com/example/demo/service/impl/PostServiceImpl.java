package com.example.demo.service.impl;

import com.example.demo.model.Post;
import com.example.demo.model.Role;
import com.example.demo.repository.PostRepository;
import com.example.demo.service.PostService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void delete(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Iterable<Post> findByAuthorName(String name) {
        return postRepository.findAllByAuthorName(name);
    }

    @Override
    public Iterable<Post> findByAuthorId(Long id) {
        return postRepository.findAllByAuthorId(id);
    }
}
