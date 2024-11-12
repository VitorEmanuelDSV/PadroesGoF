package entities;

import java.util.ArrayList;
import java.util.List;

public class Guiche {

    private List<Onibus> onibuses = new ArrayList<>();

    // Construtor da classe Guiche
    public Guiche() {
        // Adiciona um ônibus padrão com ID 1
        Onibus onibus1 = createOnibus(1, 10, 4); // Criando um ônibus com ID 1
        this.onibuses.add(onibus1); // Adicionando o ônibus à lista
    }

    public boolean registraOnibus(Onibus onibus) {
        if (this.getOnibusById(onibus.getId()) == null) {
            this.onibuses.add(onibus);  // Adiciona o ônibus à lista
            return true;
        } else {
            return false;
        }
    }


    public Onibus getOnibusById(int id) {
        for (Onibus onibus : onibuses) {
            if (onibus.getId() == id) {
                return onibus;
            }
        }
        throw new IllegalArgumentException("Ônibus com ID " + id + " não encontrado.");
    }


    public static Onibus createOnibus(int id, int cadeirasX, int cadeirasY) {
        return new Onibus(id, cadeirasX, cadeirasY);
    }
}
