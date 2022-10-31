package com.all.back.service;

import java.util.List;

import com.all.back.model.User;

public interface UserService {

    public List<User> getUser();

    public void save(User user);

    public User findById(Integer id);

    public void delete(User user);

}