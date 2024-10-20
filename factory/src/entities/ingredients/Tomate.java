package entities.ingredients;

public class Tomate implements Ingredient {

    private boolean hasTomate;

    public Tomate(boolean hasTomate) {
        this.hasTomate = hasTomate;
    }

    public String getType() {
        return ("Tomate: " + (this.hasTomate ? "Sim" : "Não"));
    }

}
