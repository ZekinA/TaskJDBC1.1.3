package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl  implements UserService {

    private UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

    public void createUsersTable() throws SQLException {
        userDaoJDBC.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDaoJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDaoJDBC.saveUser(name,lastName,age);

    }

    public void removeUserById(long id) throws SQLException {
        userDaoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers()  {
        List<User> userList = new ArrayList<>();
        try {
            userList = userDaoJDBC.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }

    public void cleanUsersTable() {
        try {
            userDaoJDBC.cleanUsersTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
