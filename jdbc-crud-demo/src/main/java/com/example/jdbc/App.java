package com.example.jdbc;

import java.util.List;

public class App {
    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        // CREATE
        dao.addUser(new User("Alice", "alice@example.com"));
        dao.addUser(new User("Bob", "bob@example.com"));

        // READ
        System.out.println("\n📖 All Users:");
        List<User> users = dao.getAllUsers();
        for (User u : users) {
            System.out.println(u.getId() + " | " + u.getName() + " | " + u.getEmail());
        }

        // UPDATE (change user with id=1)
        dao.updateUser(new User(1, "Alice Updated", "alice.new@example.com"));

        // DELETE (delete user with id=2)
        dao.deleteUser(2);

        // READ AGAIN
        System.out.println("\n📖 Users After Update/Delete:");
        users = dao.getAllUsers();
        for (User u : users) {
            System.out.println(u.getId() + " | " + u.getName() + " | " + u.getEmail());
        }
    }
}
