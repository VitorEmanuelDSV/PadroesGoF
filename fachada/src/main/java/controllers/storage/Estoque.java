package controllers.storage;

import entities.storage.Cadeira;
import entities.storage.Material;
import entities.storage.Mesa;
import relationships.admin.Entrevista;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Material> materiais = new ArrayList<>();

    public Estoque() {
        this.materiais.add(this.createCadeira(materiais.size(), "BOA"));
        this.materiais.add(this.createMesa(materiais.size(), "RUIM"));
    }

    public void infoGetEstoque() {
        StringBuilder infoEstoque = new StringBuilder();

        for(Material material : this.materiais) {
            infoEstoque.append("ID: ")
                    .append(material.getId())
                    .append("\nTipo: ")
                    .append(material.getTipo())
                    .append("\nIntegridade: ")
                    .append(material.getIntegridade())
                    .append("\n\n");
            ;
        }

        System.out.print(infoEstoque.toString());
    }
    //creator

    public Cadeira createCadeira(int id, String integridade){
        return new Cadeira(id, integridade);
    }
    public Mesa createMesa(int id, String integridade){
        return new Mesa(id, integridade);
    }
}
