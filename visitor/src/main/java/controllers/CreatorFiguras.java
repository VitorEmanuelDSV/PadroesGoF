package controllers;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class CreatorFiguras {

    public static Circulo createCirculo(double raio) {
        return new Circulo(raio);
    }

    public static Retangulo createRetangulo(double ladoBase, double lado2, double lado3, double lado4, double altura) {
        return new Retangulo(ladoBase, lado2, lado3, lado4, altura);
    }

    public static Trapezio createTrapezio(double baseMaior, double baseMenor, double altura, double lado1, double lado2) {
        return new Trapezio(baseMaior, baseMenor, altura, lado1, lado2);
    }

    public static Triangulo createTriangulo(double ladoBase, double lado2, double lado3, double altura) {
        return new Triangulo(ladoBase, lado2, lado3, altura);
    }

}
