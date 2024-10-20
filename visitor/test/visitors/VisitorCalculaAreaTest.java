package visitors;

import controllers.CreatorFiguras;
import controllers.CreatorVisitors;
import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorCalculaAreaTest {

    @Test
    public void testVisitaRetangulo() {
        VisitorIF visitorCA = CreatorVisitors.createVisitorCA();
        Retangulo retangulo = CreatorFiguras.createRetangulo(10, 5);

        assertEquals(50.00, visitorCA.visitaRetangulo(retangulo), 0.1);
    }

    @Test
    public void testVisitaTriangulo() {
        VisitorIF visitorCA = CreatorVisitors.createVisitorCA();
        Triangulo triangulo = CreatorFiguras.createTriangulo(5, 3, 3, 3);

        assertEquals(7.50, visitorCA.visitaTriangulo(triangulo), 0.1);
    }

    @Test
    public void testVisitaCirculo() {
        VisitorIF visitorCA = CreatorVisitors.createVisitorCA();
        Circulo circulo = CreatorFiguras.createCirculo(3);

        assertEquals(28.27, visitorCA.visitaCirculo(circulo), 0.1);
    }

    @Test
    public void testVisitaTrapezio() {
        VisitorIF visitorCA = CreatorVisitors.createVisitorCA();
        Trapezio trapezio = CreatorFiguras.createTrapezio(10, 5, 3, 5, 5);

        assertEquals(22.50, visitorCA.visitaTrapezio(trapezio), 0.1);
    }
}