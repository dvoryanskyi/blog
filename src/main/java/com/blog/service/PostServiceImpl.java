package com.blog.service;

import com.blog.dao.PostDAO;
import com.blog.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDAO postDAO;

    public void add(Post post) {
        postDAO.add(post);
    }

    public List<Post> getAll() {
        return postDAO.getAll();
    }

    public void update(Post post) {
        postDAO.update(post);
    }

    public void delete(Integer id) {
        postDAO.delete(id);
    }

    public Post get(Integer id) {
        return postDAO.get(id);
    }
}
