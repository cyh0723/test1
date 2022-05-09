package jdbc.service;

import jdbc.dao.UserDao;
import jdbc.dao.UserDaoImpl;
import jdbc.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao userDao=new UserDaoImpl();
    private List<User> users=new ArrayList<>();
    @Override
    public List<User> findAll() throws SQLException {
      users=userDao.findAll();
      return users;
    }

    @Override
    public User findById(Integer id) throws SQLException {

        return userDao.findById(id);
    }

    @Override
    public int insert(User user) throws SQLException {
        return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }
}
