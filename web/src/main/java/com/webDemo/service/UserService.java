package com.webDemo.service;

import com.webDemo.entity.User;
import java.util.List;

public interface UserService {


    User save(User save);

    List<User> findAll();
}
