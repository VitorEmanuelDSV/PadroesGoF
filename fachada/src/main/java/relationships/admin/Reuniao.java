package relationships.admin;

import entities.academic.Dados;
import entities.admin.User;

import java.util.ArrayList;

public class Reuniao {

    private ArrayList<User> users = new ArrayList<User>();
    private String data;
    private String horario;
    private String assunto;
    private int id;

    public Reuniao(int id, ArrayList<User> users, Dados dados, String data, String horario, String assunto) {
        this.id = id;
        this.users = users;
        this.data = data;
        this.horario = horario;
        this.assunto = assunto;
    }

    // Getters and Setters
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
