package jdbc.controller;

import jdbc.entity.User;
import jdbc.service.UserService;
import jdbc.service.UserServiceImpl;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    private UserService userService=new UserServiceImpl();

    public void findAll() throws SQLException {
        System.out.println(userService.findAll());
    }

    public void findById(int id) throws SQLException {


        System.out.println(userService.findById(id));

    }

    public void insert(User user) throws SQLException {
        userService.insert(user);
        System.out.println("yes");

    }
}
