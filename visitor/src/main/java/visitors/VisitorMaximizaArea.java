package visitors;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class VisitorMaximizaArea implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo r) {

        System.out.print(
            "Lado Base duplicado: " + (r.getLadoBase() * 2) + " u.m" +
            "\nLado 2 duplicado: " + (r.getLado2() * 2) + " u.m"+
            "\nLado 3 duplicado: " + (r.getLado3() * 2) + " u.m" +
            "\nLado 4 duplicado: " + (r.getLado4() * 2) + " u.m" +
            "\nAltura duplicada: " + (r.getAltura() * 2) + " u.m"
        );

        return 0;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {

        System.out.print(
            "Lado Base duplicado: " + (t.getLadoBase() * 2) + " u.m" +
            "\nLado 2 duplicado: " + (t.getLado2() * 2) + " u.m"+
            "\nLado 3 duplicado: " + (t.getLado3() * 2) + " u.m" +
            "\nAltura duplicada: " + (t.getAltura() * 2) + " u.m"
        );

        return 0;
    }

    @Override
    public double visitaCirculo(Circulo c) {

        System.out.print(
            "Raio duplicado: " + (c.getRaio() * 2 + " u.m")
        );

        return 0;
    }

    @Override
    public double visitaTrapezio(Trapezio t) {

        System.out.print(
            "Base maior duplicado: " + (t.getBaseMaior() * 2) + " u.m" +
            "\nBase menor duplicado: " + (t.getBaseMenor() * 2) + " u.m"+
            "\nLado 1 duplicado: " + (t.getLado1() * 2) + " u.m" +
            "\nLado 2 duplicado: " + (t.getLado2() * 2) + " u.m" +
            "\nAltura duplicada: " + (t.getAltura() * 2) + " u.m"
        );

        return 0;
    }

}
