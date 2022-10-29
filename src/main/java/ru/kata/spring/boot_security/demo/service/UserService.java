package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    boolean add(User user);

    void delete(Long id);

    User edit(User user);

    User getById(Long id);

    public User findByUsername(String username);
}
