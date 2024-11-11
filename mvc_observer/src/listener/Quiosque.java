package listener;

import entities.Onibus;
import entities.Assento;
import source.OnibusEvent;

public class Quiosque implements OnibusListener {

    private String name;

    public Quiosque(String name) {
        this.name = name;
    }

    public static Quiosque createQuiosque(String name) {
        return new Quiosque(name);
    }

    @Override
    public void mudouStatus(OnibusEvent e) {
        Onibus onibus = (Onibus) e.getSource();

        StringBuilder lista = new StringBuilder();

        lista.append(this.getName()).append("\n");
        for (Assento assento : onibus.getAssentos()) {
            lista.append("ASSENTO ").append(assento.getId()).append(" - STATUS: ").append(assento.getStatus()).append(" - LUGAR: (").append(assento.getPositionX()).append(", ").append(assento.getPositionY()).append(")\n");
        }

        System.out.println(lista.toString());

    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
