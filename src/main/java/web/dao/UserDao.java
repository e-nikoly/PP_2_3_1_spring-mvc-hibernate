package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void removeUserById(long id);

    void saveUser(User user);

    List<User> listUsers();

    User showUser(long id);
}
