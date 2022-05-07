package jdbc.entry;

import jdbc.controller.UserController;
import jdbc.entity.User;
import jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class entry {
    public static void main(String[] args) throws SQLException {
        UserController userController=new UserController();
        userController.findAll();


    }
}
