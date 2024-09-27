package controllers;

import controllers.admin.Admin;
import controllers.finance.Finance;
import controllers.infrastructure.Infrastructure;
import controllers.storage.Estoque;
import entities.admin.User;
import entities.admin.roles.Papel;
import entities.admin.*;
import entities.admin.roles.*;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SIG {

    public Admin admin;
    public Estoque estoque;
    public Infrastructure infrastructure;
    public Finance finance;

    private static ArrayList<User> users = new ArrayList<>();

    public SIG (Admin admin) {
        this.admin = admin;
        this.estoque = new Estoque();
        this.infrastructure = new Infrastructure();
        this.finance = new Finance();
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
