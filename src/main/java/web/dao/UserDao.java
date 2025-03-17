package web.dao;

import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(int id);
    void save(User user);
    void update(User user);
    void delete(int id);
}
