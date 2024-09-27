package relationships.admin;

import entities.academic.Dados;
import entities.admin.User;

public class Entrevista {

    private int id;
    private User user;
    private Dados entrevistado;
    private String data;
    private String horario;
    private String assunto;

    public Entrevista(int id, User user, Dados dados, String data, String horario, String assunto) {
        this.id = id;
        this.user = user;
        this.entrevistado = dados;
        this.data = data;
        this.horario = horario;
        this.assunto = assunto;
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Dados getDados() {
        return entrevistado;
    }

    public void setDados(Dados dados) {
        this.entrevistado = dados;
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
