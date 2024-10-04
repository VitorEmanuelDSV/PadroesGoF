package visitors;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class VisitorCalculaArea implements VisitorIF {

    private double area;

    @Override
    public double visitaRetangulo(Retangulo r) {
        double area = (r.getLadoBase() * r.getAltura());

        this.area = area;

        System.out.printf("Área: %.2f u.m²\n", area);

        return area;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        double area = ((t.getAltura() * t.getLadoBase()) / 2);

        this.area = area;

        System.out.printf("Área: %.2f u.m²\n", area);

        return area;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        double area = (Math.PI * (Math.pow(c.getRaio(), 2)));

        this.area = area;

        System.out.printf("Área: %.2f u.m²\n", area);

        return area;
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        double area = (((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2);

        this.area = area;

        System.out.printf("Área: %.2f u.m²\n", area);

        return area;
    }

    // Getters
    public double getArea() {
        return this.area;
    }

}
