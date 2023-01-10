package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void update(int id, User updatedUser);
    void delete(int id);

}
