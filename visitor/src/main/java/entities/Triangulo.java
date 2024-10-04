package entities;

public class Triangulo {

    private int ladoBase, lado2, lado3;
    private int altura;

    public Triangulo(int ladoBase, int lado2, int lado3, int altura) {

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

    // Getters and Setters
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
