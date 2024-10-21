package main.entities;

import main.contracts.IngredientIF;

public class Tomate implements IngredientIF {

    @Override
    public String getType() {
        return "Tomate \n";
    }
}
