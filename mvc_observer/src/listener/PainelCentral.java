package listener;

import source.Acento;
import source.AcentoEvent;

public class PainelCentral implements AcentoListener{

    @Override
    public void comprouAcento(AcentoEvent e) {
        System.out.println("Comprou Acento");
    }
    @Override
    public void reservouAcento(AcentoEvent e) {
        System.out.println("Reservou Acento");
    }

    private Acento[][] acentos; // Matriz de assentos

    public PainelCentral(int rows, int cols) {
        acentos = new Acento[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                acentos[i][j] = new Acento();
            }
        }
    }

    public void reservarAcento(int row, int col) {
        acentos[row][col].reservarAcento();
    }

    public void comprarAcento(int row, int col) {
        acentos[row][col].comprarAcento();
    }

    public void exibirStatusAcentos() {
        for (int i = 0; i < acentos.length; i++) {
            for (int j = 0; j < acentos[i].length; j++) {
                String status = acentos[i][j].getStatus();
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
