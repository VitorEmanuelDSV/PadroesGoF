package entities.ingredients;

public class Presunto implements Ingredient {

    private String type;

    public Presunto(String type) {

        switch (type) {
            case "frango" -> this.type = "frango";
            case "peru" -> this.type = "peru";
            case null, default -> throw new IllegalArgumentException("Tipo de Presunto não disponível!");
        }

    }

    public String getType() {
        return ("Presunto: " + this.type);
    }

}
