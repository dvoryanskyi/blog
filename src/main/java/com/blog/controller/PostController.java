package com.blog.controller;

import com.blog.entity.Post;
import com.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
//@SessionAttributes(types = Post.class)
public class PostController {


    @Autowired
    private PostService postService;

    @RequestMapping(value = "/show-table",method = RequestMethod.GET)
    public ModelAndView blog(){

        List<Post> list = postService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("blogList",list);
        return modelAndView;
    }

    @RequestMapping("/add")
    public String addPage(Model model){
        model.addAttribute("newPost",new Post());
        return "addPage";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("newPost")Post post){
        postService.add(post);
        return "index";
    }

    @RequestMapping("/index")
    public String func(){
        Post post = new Post();
        post.setAuthor("Max");
        post.setText("This is auto generated post");
        post.setTitle("GENERATED POST");
        postService.add(post);
        return "index";
    }

    @RequestMapping("/edit")
    public String editPage(@RequestParam(value = "id")Integer id, Model model){
        model.addAttribute("editedPost",postService.get(id));
        return "editPage";
    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String edit(@ModelAttribute("editedPost") Post post,Model model){
        System.out.print(post);
        postService.update(post);
        return "index";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id")Integer id){
        postService.delete(id);
        return "index";
    }

    @RequestMapping("/showPost")
    public ModelAndView showPost(@RequestParam(value = "id")Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("showPost");
        modelAndView.addObject("blog",postService.get(id));
        return modelAndView;
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

}
