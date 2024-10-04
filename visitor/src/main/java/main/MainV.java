package main;

import controllers.CreatorFiguras;
import controllers.CreatorVisitors;
import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import visitors.*;

public class MainV {

    public static void main(String[] args) {

        // MAIN
        VisitorIF visitorCA = CreatorVisitors.createVisitorCA();
        VisitorIF visitorPE = CreatorVisitors.createVisitorPE();
        VisitorIF visitorDE = CreatorVisitors.createVisitorDE();
        VisitorIF visitorMA = CreatorVisitors.createVisitorMA();

        // Círculo
        Circulo circulo = CreatorFiguras.createCirculo(3);

        System.out.print(
            "- DADOS DO CÍRCULO: \n" +
                "Raio: " + circulo.getRaio() + " u.m\n"
        );

        circulo.aceitaVisita(visitorCA);
        circulo.aceitaVisita(visitorPE);
        circulo.aceitaVisita(visitorMA);

        System.out.println("\n");

        // Retângulo
        Retangulo retangulo = CreatorFiguras.createRetangulo(10, 5, 10, 2, 5);

        System.out.println(
            "- DADOS DO RETÂNGULO: \n" +
                "Lado Base: " + retangulo.getLadoBase() + " u.m\n" +
                "Lado 2: " + retangulo.getLado2() + " u.m\n" +
                "Lado 3: " + retangulo.getLado3() + " u.m\n" +
                "Lado 4: " + retangulo.getLado4() + " u.m\n" +
                "Altura: " + retangulo.getAltura() + " u.m"
        );

        retangulo.aceitaVisita(visitorCA);
        retangulo.aceitaVisita(visitorPE);
        retangulo.aceitaVisita(visitorMA);

        System.out.println("\n");

        // Trapézio
        Trapezio trapezio = CreatorFiguras.createTrapezio(10, 5, 3, 5, 5);

        System.out.println(
            "- DADOS DO TRAPÉZIO: \n" +
                "Base Maior: " + trapezio.getBaseMaior() + " u.m\n" +
                "Base Menor: " + trapezio.getBaseMenor() + " u.m\n" +
                "Lado 1: " + trapezio.getLado1() + " u.m\n" +
                "Lado 2: " + trapezio.getLado2() + " u.m\n" +
                "Altura: " + trapezio.getAltura() + " u.m"
        );

        trapezio.aceitaVisita(visitorCA);
        trapezio.aceitaVisita(visitorPE);
        trapezio.aceitaVisita(visitorMA);

        System.out.println("\n");

        // Triângulo
        Triangulo triangulo = CreatorFiguras.createTriangulo(5, 3, 3, 3);

        System.out.println(
            "- DADOS DO TRIÂNGULO: \n" +
                "Lado Base: " + triangulo.getLadoBase() + " u.m\n" +
                "Lado 2: " + triangulo.getLado2() + " u.m\n" +
                "Lado 3: " + triangulo.getLado3() + " u.m\n" +
                "Altura: " + triangulo.getAltura() + " u.m"
        );

        triangulo.aceitaVisita(visitorCA);
        triangulo.aceitaVisita(visitorPE);
        triangulo.aceitaVisita(visitorMA);

        System.out.println("\n");

        // DESENHOS
        System.out.println("- DESENHOS: \n");

        System.out.println("CÍRCULO: ");
        circulo.aceitaVisita(visitorDE);

        System.out.println("\nRETÂNGULO: ");
        retangulo.aceitaVisita(visitorDE);

        System.out.println("\nTRAPÉZIO: ");
        trapezio.aceitaVisita(visitorDE);

        System.out.println("\nTRIÂNGULO: ");
        triangulo.aceitaVisita(visitorDE);


    }

}
