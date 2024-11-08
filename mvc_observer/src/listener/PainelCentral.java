package listener;

import entities.Assento;
import source.AssentoEvent;

public class PainelCentral implements AssentoListener {

    @Override
    public void comprouAssento(AssentoEvent e) {
        System.out.println("Comprou Acento");
    }

    @Override
    public void mudouStatus(AssentoEvent e) {

    }

    @Override
    public void reservouAssento(AssentoEvent e) {
        System.out.println("Reservou Acento");
    }

    private Assento[][] assentos; // Matriz de assentos

    public PainelCentral(int rows, int cols) {
        assentos = new Assento[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                assentos[i][j] = new Assento();
            }
        }
    }

    public void reservarAcento(int row, int col) {
        assentos[row][col].reservarAcento();
    }

    public void comprarAcento(int row, int col) {
        assentos[row][col].comprarAcento();
    }

    public void exibirStatusAcentos() {
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                String status = assentos[i][j].getStatus();
                switch (status) {
                    case "Disponível":
                        System.out.print("G "); // Verde para disponível
                        break;
                    case "Reservado":
                        System.out.print("Y "); // Amarelo para reservado
                        break;
                    case "Comprado":
                        System.out.print("R "); // Vermelho para comprado
                        break;
                }
            }
            System.out.println();
        }
    }
}
