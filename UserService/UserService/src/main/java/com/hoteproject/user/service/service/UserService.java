package com.hoteproject.user.service.service;


import com.hoteproject.user.service.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUser(Integer userId);
}
