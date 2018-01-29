package com.webDemo.service.impl;

import com.webDemo.UserRepository;
import com.webDemo.entity.User;
import com.webDemo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User save) {
        return userRepository.save(save);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
