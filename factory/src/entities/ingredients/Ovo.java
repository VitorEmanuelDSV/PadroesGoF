package entities.ingredients;

public class Ovo implements Ingredient {

    private String type;

    public Ovo(String type) {

        switch (type) {
            case "capoeira" -> this.type = "capoeira";
            case "granja" -> this.type = "granja";
            case null, default -> throw new IllegalArgumentException("Tipo de Ovo não disponível!");
        }

    }

    public String getType() {
        return ("Ovo: " + this.type);
    }

}
