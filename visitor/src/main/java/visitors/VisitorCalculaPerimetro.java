package visitors;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class VisitorCalculaPerimetro implements VisitorIF {

    private double perimetro;

    @Override
    public double visitaRetangulo(Retangulo r) {
        double perimetro = (r.getLadoBase() + r.getLado2() + r.getLado3() + r.getLado4());

        this.perimetro = perimetro;

        System.out.printf("Perimetro: %.2f u.m\n", perimetro);

        return perimetro;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        double perimetro = (t.getLadoBase() + t.getLado2() + t.getLado2());

        this.perimetro = perimetro;

        System.out.printf("Perimetro: %.2f u.m\n", perimetro);

        return perimetro;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        double perimetro = (2 * Math.PI * c.getRaio());

        this.perimetro = perimetro;

        System.out.printf("Perimetro: %.2f u.m\n", perimetro);

        return perimetro;
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        double perimetro = (t.getBaseMaior() + t.getBaseMenor() + t.getLado2() + t.getLado2());

        this.perimetro = perimetro;

        System.out.printf("Perimetro: %.2f u.m\n", perimetro);

        return perimetro;
    }

    // Getters
    public double getPerimetro() {
        return this.perimetro;
    }
    
}
