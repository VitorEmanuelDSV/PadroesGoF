package entities.admin;

import entities.admin.roles.Papel;

public class User {

    private int id;
    private String nome;
    private Papel permissao;

    public User(int id, String nome, Papel permissao) {
        this.id = id;
        this.nome = nome;
        this.permissao = permissao;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Papel getPermissao() {
        return permissao;
    }

    public void setPermissao(Papel permissao) {
        this.permissao = permissao;
    }
}
