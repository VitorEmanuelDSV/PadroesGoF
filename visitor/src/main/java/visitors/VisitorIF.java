package visitors;

import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public interface VisitorIF {

    public double visitaRetangulo(Retangulo r);
    public double visitaTriangulo (Triangulo t);
    public double visitaCirculo (Circulo c);
    public  double visitaTrapezio (Trapezio t);

}
