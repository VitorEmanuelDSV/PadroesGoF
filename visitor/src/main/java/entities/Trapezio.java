package entities;

public class Trapezio {

    private int baseMaior;
    private int baseMenor;
    private  int altura;

    private int lado1, lado2;

    public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {

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

    // Getters and Setters

    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
}
