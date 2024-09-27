package controllers.admin;

import controllers.SIG;
import entities.academic.Dados;
import relationships.admin.Entrevista;
import relationships.admin.Reuniao;

import java.util.ArrayList;

public class Admin {

    private ArrayList<Entrevista> entrevistas = new ArrayList<>();
    private ArrayList<Reuniao> reunioes = new ArrayList<>();

    public Admin() {}

    public boolean createEntrevista(int user_id, String nome, String cpf, String email, String data, String horario, String assunto) {

        this.entrevistas.add(new Entrevista(
                entrevistas.size(),
                SIG.getUserById(user_id),
                new Dados(nome, cpf, email),
                data,
                horario,
                assunto
        ));

        return true;
    }

    public boolean createReuniao(int[] user_ids, String nome, String cpf, String email, String data, String horario, String assunto) {
        this.reunioes.add(new Reuniao(
                SIG.getUsersById(user_ids),
                new Dados(nome, cpf, email),
                data,
                horario,
                assunto
        ));

        return true;
    }

    // INFO
    public void infoGetEntrevistas() {
        StringBuilder entrevistas = new StringBuilder();

        for(Entrevista entrevista : this.entrevistas) {
            entrevistas.append("Entrevista de ID: ")
                    .append(entrevista.getId())
                    .append("\nResponsável: ")
                    .append(entrevista.getUser().getNome())
                    .append("\nEntrevistado: ")
                    .append(entrevista.getDados().getNome())
                    .append("\nData: ").append(entrevista.getData()).append(" ").append(entrevista.getHorario())
                    .append("\nAssunto: ")
                    .append(entrevista.getAssunto())
                    .append("\n\n");
            ;
        }

        System.out.print(entrevistas.toString());
    }

    // Getters and Setters
    public ArrayList<Entrevista> getEntrevistas() {
        return entrevistas;
    }

    public ArrayList<Reuniao> getReunioes() {
        return reunioes;
    }
}
