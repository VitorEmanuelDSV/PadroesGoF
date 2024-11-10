package entities;

import contracts.FigurasGeometricas;

public class QuadradoSing implements FigurasGeometricas {
    private double lado;

    @Override
    public String whoAmI() {
        StringBuilder whoAmI = new StringBuilder();

        whoAmI.append("Quadrado de lado: ")
                .append(lado);

        return whoAmI.toString();
    }

    // getters and setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
        }
        this.lado = lado;
    }
}
