package com.blog.service;


import com.blog.entity.Post;

import java.util.List;

public interface PostService {

    public void add(Post post);

    public List<Post> getAll();

    public void update(Post post);

    public void delete(Integer id);

    public Post get(Integer id);
 }
