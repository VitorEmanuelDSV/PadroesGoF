package entities;

import java.util.ArrayList;
import java.util.List;

public class Guiche {

    private List<Onibus> onibuses = new ArrayList<>();

    public void compraAssento(int idOnibus, int idAssento) {
        this.getOnibusById(idOnibus).compraAssentoById(idAssento);
    }

    public boolean registraOnibus(Onibus onibus) {
        if(this.getOnibusById(onibus.getId()) == null) {
            this.onibuses.add(onibus);
            return true;
        }
        else {
            throw new IllegalArgumentException("ID do ônibus duplicado!");
        }
    }

    public Onibus getOnibusById(int id) {
        for(Onibus onibus : onibuses) {
            if(onibus.getId() == id) {
                return onibus;
            }
        }
        return null;
    }

    public static Onibus createOnibus(int id, int cadeirasX, int cadeirasY) {
        return new Onibus(id, cadeirasX, cadeirasY);
    }


}
