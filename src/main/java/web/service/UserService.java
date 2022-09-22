package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void add(long id, User user);

    void removeUserById(long id);

    void saveUser(User user);

    List<User> listUsers();

    User showUser(long id);
}
