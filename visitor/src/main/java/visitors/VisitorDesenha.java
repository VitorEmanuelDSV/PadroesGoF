package visitors;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class VisitorDesenha implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo r) {


        return 0;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        return 0;
    }

    @Override
    public double visitaCirculo(Circulo c) {

        System.out.println("\n");

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


        return 0;
    }

}
