package entities;

import concrete.ElementoConcretoIF;
import visitors.VisitorIF;

public class Trapezio implements ElementoConcretoIF {

    private double baseMaior;
    private double baseMenor;
    private  double altura;

    private double lado1, lado2;

    public Trapezio(double baseMaior, double baseMenor, double altura, double lado1, double lado2) {

        if (
            baseMaior <= baseMenor ||
            baseMaior <= 0 ||
            baseMenor <= 0 ||
            altura <= 0 ||
            lado1 <= 0 ||
            lado2 <= 0
        ) throw new IllegalArgumentException("Medidas inválidas para um trapézio!");

        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void aceitaVisita(VisitorIF v) {
        v.visitaTrapezio(this);
    }

    // Getters and Setters

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
}
