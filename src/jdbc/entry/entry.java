package jdbc.entry;

import jdbc.controller.UserController;
import jdbc.entity.User;
import jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class entry {
    public static void main(String[] args) throws SQLException {
        UserController userController=new UserController();
        userController.findAll();

        System.out.println("id:");

        Scanner in =new Scanner(System.in);
        int id = in.nextInt();

        userController.findById(id);



    }
}
