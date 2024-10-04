package entities;


import concrete.ElementoConcretoIF;
import visitors.VisitorIF;

public class Retangulo implements ElementoConcretoIF {

    private double altura;
    private double ladoBase, lado2, lado3, lado4;

    public Retangulo(double ladoBase, double lado2, double lado3, double lado4, double altura) {

        if (
            altura <= 0 ||
            ladoBase <= 0 ||
            lado2 <= 0 ||
            lado3 <= 0 ||
            lado4 <= 0
        ) throw new IllegalArgumentException("Medidas inválidas!");

        this.altura = altura;
        this.ladoBase = ladoBase;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
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

    public double getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }
}
