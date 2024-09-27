package controllers.storage;

import entities.admin.User;
import entities.storage.Cadeira;
import entities.storage.Material;
import entities.storage.Mesa;
import relationships.admin.Entrevista;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Estoque {
    public ArrayList<Material> materiais = new ArrayList<>();

    public Material getMaterialById(int id) {
        for(Material material : materiais) {
            if(material.getId() == id) {
                return material;
            }
        }
        throw new NoSuchElementException("Material not found");
    }

    public void addMaterial(Material material){
        materiais.add(material);
    }
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

    public static Cadeira createCadeira(int id, String integridade){
        return new Cadeira(id, integridade);
    }
    public static Mesa createMesa(int id, String integridade){
        return new Mesa(id, integridade);
    }
}
