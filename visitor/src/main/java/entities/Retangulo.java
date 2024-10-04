package entities;

import concrete.ElementoConcretoIF;
import visitors.VisitorIF;

public class Retangulo implements ElementoConcretoIF {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {

        if (
            altura <= 0 ||
            largura <= 0
        ) throw new IllegalArgumentException("Medidas inválidas!");

        this.altura = altura;
        this.largura = largura;
    }

    public void aceitaVisita(VisitorIF v) {
        v.visitaRetangulo(this);
    }

    // Getters and Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }


}
