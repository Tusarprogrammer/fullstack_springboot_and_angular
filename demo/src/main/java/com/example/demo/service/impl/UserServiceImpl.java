package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User addUser(User user) {

        User userUpdated = userRepo.save(user);
        return userUpdated;
    }

}
