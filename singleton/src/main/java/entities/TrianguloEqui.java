package entities;

public class TrianguloEqui extends TrianguloSing {

    @Override
    public String whoAmI() {
        StringBuilder whoAmI = new StringBuilder();

        whoAmI.append("Triangulo Equilatero de base: ")
                .append(this.getBase())
                .append(", lado 1: ")
                .append(this.getLado1())
                .append(", lado 2: ")
                .append(this.getLado2());

        return whoAmI.toString();
    }
}
