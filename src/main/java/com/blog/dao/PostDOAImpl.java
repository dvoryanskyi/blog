package com.blog.dao;

import com.blog.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class PostDOAImpl implements PostDAO{


    @Autowired
    private SessionFactory sessionFactory;

    public void add(Post post) {
        Session session = sessionFactory.getCurrentSession();
        session.save(post);
    }

    public List<Post> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Post> list = session.createCriteria(Post.class).list();
        return list;
    }

    public void update(Post post) {

        Session session = sessionFactory.getCurrentSession();
        System.out.println(post.getId());
        Post exPost = (Post)session.get(Post.class,post.getId());
        //Post exPost = session.createQuery("from Post where id =:id").setParameter("id",post.getId());

        exPost.setText(post.getText());
        exPost.setTitle(post.getTitle());
        session.update(exPost);
    }

    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Post post =(Post) session.get(Post.class,id);
        if(post!=null){
            session.delete(post);
        }
        else {
            System.out.println("nema takoi entity");
        }
    }

    public Post get(Integer id) {

        return (Post)sessionFactory.getCurrentSession().get(Post.class,id);
    }

}
