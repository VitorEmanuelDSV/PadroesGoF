package controllers.admin;

import controllers.SIG;
import entities.academic.Dados;
import entities.admin.User;
import relationships.admin.Entrevista;
import relationships.admin.Reuniao;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Admin {

    private static ArrayList<Entrevista> entrevistas = new ArrayList<>();
    private static ArrayList<Reuniao> reunioes = new ArrayList<>();

    public Admin() {}

    public boolean createEntrevista(int user_id, String nome, String cpf, String email, String data, String horario, String assunto) {

        entrevistas.add(new Entrevista(
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
        reunioes.add(new Reuniao(
                reunioes.size(),
                SIG.getUsersById(user_ids),
                new Dados(nome, cpf, email),
                data,
                horario,
                assunto
        ));

        return true;
    }

    public static Entrevista getEntrevistaById(int id) {
        for(Entrevista entrevista : entrevistas) {
            if(entrevista.getId() == id) {
                return entrevista;
            }
        }

        throw new NoSuchElementException("Entrevista não encontrada");
    }

    public static Reuniao getReuniaoById(int id) {
        for(Reuniao reuniao : reunioes) {
            if(reuniao.getId() == id) {
                return reuniao;
            }
        }

        throw new NoSuchElementException("Reunião não encontrada");
    }

    // INFO
    public String infoGetEntrevistas() {
        StringBuilder infoEntrevistas = new StringBuilder();

        for(Entrevista entrevista : entrevistas) {
            infoEntrevistas.append("Entrevista de ID: ")
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

        return infoEntrevistas.toString();
    }

    public String infoGetReunioes () {
        StringBuilder infoReunioes = new StringBuilder();

        for(Reuniao reuniao : reunioes) {

            StringBuilder users = new StringBuilder();

            for(User user : reuniao.getUsers()) {
                users.append(user.getNome()).append(", ");
            }

            users.deleteCharAt(users.length() - 2);

            infoReunioes.append("Reunião de ID: ")
                    .append(reuniao.getId())
                    .append("\nParticipantes: ")
                    .append(users)
                    .append("\nData: ").append(reuniao.getData()).append(" ").append(reuniao.getHorario())
                    .append("\nAssunto: ")
                    .append(reuniao.getAssunto())
                    .append("\n\n");
            ;
        }

        return infoReunioes.toString();
    }

    // Getters and Setters
    public ArrayList<Entrevista> getEntrevistas() {
        return entrevistas;
    }

    public ArrayList<Reuniao> getReunioes() {
        return reunioes;
    }

    // Mock
    public void mockReuniao() {
        int[] users_ids = {0, 1};

        this.createReuniao(
                users_ids,
                "Gabriel",
                "20492492424",
                "gabriel@gmail.com",
                "28/03/2004",
                "03:00PM",
                "Reunião com Sabrina"
        );

        this.createReuniao(
                users_ids,
                "Caleb",
                "20492492424",
                "gabriel@gmail.com",
                "28/03/2004",
                "04:00PM",
                "OPT"
        );
    }
}
