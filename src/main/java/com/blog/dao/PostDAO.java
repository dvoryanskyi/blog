package com.blog.dao;

import com.blog.entity.Post;

import java.util.List;


public interface PostDAO {
    public void add(Post post);

    public List<Post> getAll();

    public void update(Post post);

    public void delete(Integer id);

    public Post get(Integer id);
}
