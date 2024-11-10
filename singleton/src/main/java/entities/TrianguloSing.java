package entities;

import contracts.FigurasGeometricas;

abstract class TrianguloSing implements FigurasGeometricas {
    private double base;
    private double lado1;
    private double lado2;

    // getters and setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser maior que zero.");
        }
        this.base = base;
        validarDesigualdadeTriangular();
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 <= 0) {
            throw new IllegalArgumentException("O lado 1 deve ser maior que zero.");
        }
        this.lado1 = lado1;
        validarDesigualdadeTriangular();
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 <= 0) {
            throw new IllegalArgumentException("O lado 2 deve ser maior que zero.");
        }
        this.lado2 = lado2;
        validarDesigualdadeTriangular();
    }

    // Validação da desigualdade triangular
    private void validarDesigualdadeTriangular() {
        if (base > 0 && lado1 > 0 && lado2 > 0) {
            if (base >= lado1 + lado2 || lado1 >= base + lado2 || lado2 >= base + lado1) {
                throw new IllegalArgumentException("Os valores fornecidos não satisfazem a desigualdade triangular.");
            }
        }
    }
}
