package jdbc.service;

import jdbc.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    List<User> findAll() throws SQLException;

    User findById(Integer id) throws SQLException;

    int insert(User user) throws SQLException;

    int update(User user);

    int delete(Integer id);
}
