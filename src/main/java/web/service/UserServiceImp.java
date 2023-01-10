package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }


    @Transactional
    @Override
    public void update(int id, User updatedUser) {
        userDAO.update(id, updatedUser);
    }
    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
