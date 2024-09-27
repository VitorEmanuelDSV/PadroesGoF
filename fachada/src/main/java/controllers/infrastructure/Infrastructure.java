package controllers.infrastructure;

import entities.infrastructure.Sala;
import entities.storage.Material;

import java.util.ArrayList;

public class Infrastructure {
    private ArrayList<Sala> salas = new ArrayList<>();

    public Infrastructure(){
        this.salas.add(this.createSala(salas.size(),"CIAC","ANDAR 3", "BOA"));
    }
    public void infoGetInfrastructure() {
        StringBuilder infoInfrastructure = new StringBuilder();

        for(Sala sala : this.salas) {
            infoInfrastructure.append("ID: ")
                    .append(sala.getId())
                    .append("\nLocalização: ")
                    .append(sala.getLocalizacao())
                    .append("\nSetor: ")
                    .append(sala.getSetor())
                    .append("\nIntegridade: ")
                    .append(sala.getIntegridade())
                    .append("\n\n");
            ;
        }

        System.out.print(infoInfrastructure.toString());
    }

    //creator
    public Sala createSala(int id, String localizacao, String setor, String integridade) {
        return new Sala(id, localizacao, setor, integridade);
    }
}
