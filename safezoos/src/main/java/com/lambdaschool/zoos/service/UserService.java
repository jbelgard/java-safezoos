package com.lambdaschool.zoos.service;

import com.lambdaschool.zoos.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(long userid);

    void delete(long userid);

    User save(User user);

    User update(User user, long userid);
}
