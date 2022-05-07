package jdbc.dao;

import jdbc.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    List<User> findAll() throws SQLException;

    User findById(Integer id);

    int insert(User user);

    int update(User user);

    int delete(Integer id);

}
