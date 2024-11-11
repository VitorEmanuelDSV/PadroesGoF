package main;

import entities.*;
import singleton.FigureFactory;

public class MainSingleton {
    public static void main(String[] args) {

        FigureFactory fabrica = FigureFactory.getInstance();

        CirculoSing circulo1 = fabrica.criarCirculo();
        CirculoSing circulo2 = fabrica.criarCirculo();
        System.out.println("Círculos são iguais? " + (circulo1 == circulo2));

        TrianguloIso trianguloIsosceles1 = fabrica.criarTrianguloIsosceles();
        TrianguloIso trianguloIsosceles2 = fabrica.criarTrianguloIsosceles();
        System.out.println("Triângulos isósceles são iguais? " + (trianguloIsosceles1 == trianguloIsosceles2));

        TrianguloEqui trianguloEquilatero1 = fabrica.criarTrianguloEquilatero();
        TrianguloEqui trianguloEquilatero2 = fabrica.criarTrianguloEquilatero();
        System.out.println("Triângulos equiláteros são iguais? " + (trianguloEquilatero1 == trianguloEquilatero2));

        TrianguloRet trianguloRetangulo1 = fabrica.criarTrianguloRetangulo();
        TrianguloRet trianguloRetangulo2 = fabrica.criarTrianguloRetangulo();
        System.out.println("Triângulos retângulos são iguais? " + (trianguloRetangulo1 == trianguloRetangulo2));

        QuadradoSing quadrado1 = fabrica.criarQuadrado();
        QuadradoSing quadrado2 = fabrica.criarQuadrado();
        System.out.println("Quadrados são iguais? " + (quadrado1 == quadrado2));

        System.out.println("\nTestes de atribuicoes de valores:\n");

        circulo1.setRaio(2.0);
        System.out.println(circulo1.whoAmI());
        System.out.println(circulo2.whoAmI() + "\n");

        trianguloIsosceles1.setBase(4.0);
        System.out.println(trianguloIsosceles1.whoAmI());
        System.out.println(trianguloIsosceles2.whoAmI() + "\n");

        trianguloEquilatero1.setBase(4.0);
        System.out.println(trianguloEquilatero1.whoAmI());
        System.out.println(trianguloEquilatero2.whoAmI() + "\n");

        trianguloRetangulo1.setBase(4.0);
        System.out.println(trianguloRetangulo1.whoAmI());
        System.out.println(trianguloRetangulo2.whoAmI() + "\n");

        quadrado1.setLado(2.0);
        System.out.println(quadrado1.whoAmI());
        System.out.println(quadrado2.whoAmI() + "\n");
    }
}
