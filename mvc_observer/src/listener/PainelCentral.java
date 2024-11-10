package listener;

import entities.Onibus;
import entities.Assento;
import source.OnibusEvent;

import java.util.Arrays;

public class PainelCentral implements OnibusListener {

    public static PainelCentral createPainel() {
        return new PainelCentral();
    }

    @Override
    public void mudouStatus(OnibusEvent e) {

        Onibus onibus = (Onibus) e.getSource();

        String[][] assentos = new String[onibus.numeroDeAssentosX][onibus.numeroDeAssentosY];

        for (String[] strings : assentos) {
            Arrays.fill(strings, "G");
        }

        for(Assento assento : onibus.getAssentos()) {

            String charStatus = switch (assento.getStatus()) {
                case "DISPONIVEL" -> "G";
                case "RESERVADO" -> "Y";
                case "INDISPONIVEL" -> "R";
                default -> "";
            };

            assentos[assento.getPositionY()][assento.getPositionX()] = charStatus;
        }

        System.out.println("PAINEL CENTRAL");
        for (String[] assento : assentos) {
            for (String s : assento) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        System.out.println();

    }


}
