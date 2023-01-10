package web.dao;

import org.springframework.stereotype.Repository;
import web.models.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import javax.persistence.*;

@Repository
public class UserDAOImp implements UserDAO{

    @PersistenceContext(unitName = "entityManager")
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> query = entityManager.createQuery("select u from User u", User.class);
        return query.getResultList();    }
    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }
    @Override
    public void update(int id, User updatedUser) {
        entityManager.merge(updatedUser);
        entityManager.flush();
    }
    @Override
    public void delete(int id) {
        entityManager.remove(getUserById(id));
    }

}
