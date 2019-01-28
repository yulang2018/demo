package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User getByid(@PathVariable String id){
        return userService.getById(id);
    }

    @RequestMapping("/add")
    public void add(){
        User user=new User();
        user.setId("1");
        user.setName("玉郎");
        userService.insert(user);
    }

}
