package com.all.back.backUser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.back.backUser.model.User;
import com.all.back.backUser.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public List<User> getUser() {

        return userRepo.findAll();
    }

    @Override
    public void save(User user) {

        userRepo.save(user);

    }

    @Override
    public User findById(Integer id) {

        Optional<User> userResult = userRepo.findById(id);
        User user = null;
        if (userResult.isPresent()) {
            user = userResult.get();
        }
        return user;
    }

    @Override
    public void delete(User user) {

        userRepo.delete(user);

    }

}