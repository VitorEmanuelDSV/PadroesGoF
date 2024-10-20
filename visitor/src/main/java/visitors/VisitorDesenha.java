package visitors;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class VisitorDesenha implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo r) {

        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getLargura(); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return 0;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {

        for (int i = 1; i <= t.getAltura(); i++) {
            for (int j = i; j < t.getAltura(); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        return 0;
    }

    @Override
    public double visitaCirculo(Circulo c) {

        int raio = (int) c.getRaio();
        int diametro = raio * 2;

        for (int i = 0; i <= diametro; i++) {

            for (int j = 0; j <= diametro; j++) {
                double distancia = Math.sqrt(Math.pow(i - raio, 2) + Math.pow(j - raio, 2));

                if (Math.abs(distancia - raio) < 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        return 0;
    }

    @Override
    public double visitaTrapezio(Trapezio t) {

        for (int i = 0; i < t.getAltura(); i++) {
            int larguraAtual = (int) ((t.getBaseMaior() - t.getBaseMenor()) / t.getAltura() * (t.getAltura() - i)) + (int) t.getBaseMenor();

            for (int j = 0; j < (int) ((t.getBaseMaior() - larguraAtual) / 2); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < larguraAtual; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        return 0;
    }

}
