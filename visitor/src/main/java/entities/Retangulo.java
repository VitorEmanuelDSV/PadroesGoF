package entities;


import concrete.ElementoConcretoIF;
import visitors.VisitorIF;

public class Retangulo implements ElementoConcretoIF {

    private  int altura;
    private int ladoBase, lado2, lado3, lado4;

    public Retangulo(int ladoBase, int lado2, int lado3, int lado4, int altura) {

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
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(int ladoBase) {
        this.ladoBase = ladoBase;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }
}
