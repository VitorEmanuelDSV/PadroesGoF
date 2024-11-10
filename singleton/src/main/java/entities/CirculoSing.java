package entities;

import contracts.FigurasGeometricas;

public class CirculoSing implements FigurasGeometricas {
    private double raio;

    @Override
    public String whoAmI() {
        StringBuilder whoAmI = new StringBuilder();

        whoAmI.append("Circulo de raio: ")
                .append(raio);

        return whoAmI.toString();
    }

    // getters and setters

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }
}
