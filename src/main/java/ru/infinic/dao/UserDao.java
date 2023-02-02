package ru.infinic.dao;

import ru.infinic.model.User;

import java.util.List;


public interface UserDao {
    void createUsersTable();
    void dropUsersTable();
    void createUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    User getUserById(long id);
    List<User> getAllUsers();
}
