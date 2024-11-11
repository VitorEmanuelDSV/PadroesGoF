package testjava;

import entities.Assento;
import entities.Guiche;
import entities.Onibus;
import listener.PainelCentral;
import listener.Quiosque;

import java.util.ArrayList;

public class BaseTestObserver {
    Guiche guiche = new Guiche();

    PainelCentral painel = PainelCentral.createPainel();
    Quiosque quiosque1 = Quiosque.createQuiosque("Quiosque 1");

    Onibus onibius = Guiche.createOnibus(1, 4, 4);

    ArrayList<Assento> assentos = new ArrayList<Assento>();

    Assento assento1 = onibius.createAssento(1, 1, 1);
    Assento assento2 = onibius.createAssento(2, 1, 2);
    Assento assento3 = onibius.createAssento(3, 3, 3);
    Assento assento4 = onibius.createAssento(4, 1, 3);

    public BaseTestObserver() {
        assentos.add(assento1);
        assentos.add(assento2);
        assentos.add(assento3);
        assentos.add(assento4);

        for(Assento _assento : assentos) {
            _assento.setAssentoListener(guiche.getOnibusById(1));
        }

        guiche.getOnibusById(1).addOnibusListener(painel);
        guiche.getOnibusById(1).addOnibusListener(quiosque1);
    }

}
