package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov",(byte) 50);
        userService.saveUser("Кодинг", "Говнов",(byte) 100);
        userService.saveUser("Вынос", "Мозгов",(byte) 127);
        userService.saveUser("Земля", "Пухов",(byte) 4);
        List<User> users = userService.getAllUsers();
        for (User l: users){
            System.out.println(l);
        }
        userService.createUsersTable();
        userService.dropUsersTable();

    }
}
