package entities.ingredients;

public class Pao implements Ingredient {

    private String type;

    public Pao(String type) {

        switch (type) {
            case "integral" -> this.type = "integral";
            case "frances" -> this.type = "frances";
            case "bola" -> this.type = "bola";
            case null, default -> throw new IllegalArgumentException("Tipo de Pão não disponível!");
        }

    }

    public String getType() {
        return ("Pão: " + this.type);
    }

}
