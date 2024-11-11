package entities;

public class TrianguloRet extends TrianguloSing {

    @Override
    public String whoAmI() {
        StringBuilder whoAmI = new StringBuilder();

        whoAmI.append("Triangulo Retangulo de base: ")
                .append(this.getBase())
                .append(", lado 1: ")
                .append(this.getLado1())
                .append(", lado 2: ")
                .append(this.getLado2());

        return whoAmI.toString();
    }
}
