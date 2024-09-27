package controllers;

import controllers.admin.Admin;
import entities.admin.User;
import entities.admin.roles.Papel;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SIG {

    public Admin admin;

    private static ArrayList<User> users = new ArrayList<>();

    public SIG (Admin admin) {
        this.admin = admin;
    }

    public boolean createUser(String nome, Papel permissao) {
        users.add(
                new User(users.size(), nome, permissao)
        );

        return true;
    }

    public boolean removeUser(int id) {
        users.removeIf(user -> user.getId() == id);

        return true;
    }

    public static User getUserById(int user_id) {
        for(User user : users) {
            if(user.getId() == user_id) {
                return user;
            }
        }

        throw new NoSuchElementException("User not found");
    }

    public static ArrayList<User> getUsersById(int[] user_ids) {

        ArrayList<User> users = new ArrayList<>();

        for (int userId : user_ids) {
            users.add(getUserById(userId));
        }

        return users;
    }

    // Creator
    public static Admin createAdmin() {
        return new Admin();
    }

}
