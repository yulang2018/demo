package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    public User getById(String id);

    public void insert(User user);
}
