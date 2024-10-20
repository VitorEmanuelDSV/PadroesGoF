package entities.ingredients;

public class Queijo implements Ingredient {

    private String type;

    public Queijo(String type) {

        switch (type) {
            case "prato" -> this.type = "prato";
            case "mussarela" -> this.type = "mussarela";
            case "cheddar" -> this.type = "cheddar";
            case null, default -> throw new IllegalArgumentException("Tipo de Queijo não disponível!");
        }

    }

    public String getType() {
        return ("Queijo: " + this.type);
    }

}
