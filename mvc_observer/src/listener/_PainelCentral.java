package listener;


import entities.Assento;
import entities.Onibus;
import entities._Assento;
import source.OnibusEvent;

import java.util.Arrays;

public class _PainelCentral implements OnibusListener {


    @Override
    public void mudouStatus(OnibusEvent e) {

        Onibus onibus = (Onibus) e.getSource();

        String[][] assentos = new String[onibus.numeroDeAssentosX][onibus.numeroDeAssentosY];

        for (String[] strings : assentos) {
            Arrays.fill(strings, "G");
        }

        for(_Assento assento : onibus.assentos) {

            String charStatus = switch (assento.getStatus()) {
                case "DISPONIVEL" -> "G";
                case "RESERVADO" -> "Y";
                case "INDISPONIVEL" -> "R";
                default -> "";
            };

            assentos[assento.positionX][assento.positionY] = charStatus;
        }

        for (String[] assento : assentos) {
            for (String s : assento) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }


}
