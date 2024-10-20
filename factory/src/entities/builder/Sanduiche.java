package entities.builder;

import entities.ingredients.Ingredient;

import java.util.ArrayList;

public class Sanduiche {

    private final ArrayList<Ingredient> ingredientes;

    public Sanduiche(ArrayList<Ingredient> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getSanduiche() {
        StringBuilder sb = new StringBuilder();

        sb.append("Ingredientes: \n");

        for(Ingredient ingrediente : ingredientes) {
            sb.append(ingrediente.getType()).append("\n");
        }

        return sb.toString();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientes.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredientes.remove(ingredient);
    }

}
