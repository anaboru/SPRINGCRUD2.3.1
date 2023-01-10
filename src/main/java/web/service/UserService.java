package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
