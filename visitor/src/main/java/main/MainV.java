package main;

import entities.Circulo;
import entities.Retangulo;
import visitors.*;

public class MainV {

    public static void main(String[] args) {

        // MAIN
        VisitorIF visitorCA = new VisitorCalculaArea();
        VisitorIF visitorPE = new VisitorCalculaPerimetro();
        VisitorIF visitorD = new VisitorDesenha();
        VisitorIF visitorMA = new VisitorMaximizaArea();

        // Círculo
        Circulo circulo = new Circulo(15);

        System.out.print(
            "- DADOS DO CÍRCULO: \n" +
                "Raio: " + circulo.getRaio() + " u.m\n"
        );

        circulo.aceitaVisita(visitorCA);
        circulo.aceitaVisita(visitorPE);
        circulo.aceitaVisita(visitorMA);

        System.out.println("\n");

        // Retângulo
        Retangulo retangulo = new Retangulo(10, 5, 10, 2, 5);

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

        // Triângulo


        System.out.println("\n");

        // DESENHOS
//        circulo.aceitaVisita(visitorD);


    }

}
