package com.all.back.backUser.service;

import java.util.List;

import com.all.back.backUser.model.User;

public interface UserService {

    public List<User> getUser();

    public void save(User user);

    public User findById(Integer id);

    public void delete(User user);

}