package entities;

import concrete.ElementoConcretoIF;
import visitors.VisitorIF;

public class Triangulo implements ElementoConcretoIF {

    private double ladoBase, lado2, lado3;
    private double altura;

    public Triangulo(double ladoBase, double lado2, double lado3, double altura) {

        if (
            ladoBase <= 0 ||
            lado2 <= 0 ||
            lado3 <= 0 ||
            altura <= 0
        ) throw new IllegalArgumentException("Medidas inválidas!");

        if (
            ladoBase + lado2 <= lado3 ||
            ladoBase + lado3 <= lado2 ||
            lado2 + lado3 <= ladoBase
        ) throw new IllegalArgumentException("Triângulo inexistente!");

        this.ladoBase = ladoBase;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    public void aceitaVisita(VisitorIF v) {
        v.visitaTriangulo(this);
    }

    // Getters and Setters
    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(int ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
