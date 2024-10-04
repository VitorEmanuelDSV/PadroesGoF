package visitors;

import controllers.CreatorFiguras;
import controllers.CreatorVisitors;
import entities.Circulo;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorCalculaPerimetroTest {

    @Test
    public void testVisitaRetangulo() {
        VisitorIF visitorPE = CreatorVisitors.createVisitorPE();
        Retangulo retangulo = CreatorFiguras.createRetangulo(10, 5);

        assertEquals(30.00, visitorPE.visitaRetangulo(retangulo), 0.1);
    }

    @Test
    public void testVisitaTriangulo() {
        VisitorIF visitorPE = CreatorVisitors.createVisitorPE();
        Triangulo triangulo = CreatorFiguras.createTriangulo(5, 3, 3, 3);

        assertEquals(11.00, visitorPE.visitaTriangulo(triangulo), 0.1);
    }

    @Test
    public void testVisitaCirculo() {
        VisitorIF visitorPE = CreatorVisitors.createVisitorPE();
        Circulo circulo = CreatorFiguras.createCirculo(3);

        assertEquals(18.85, visitorPE.visitaCirculo(circulo), 0.1);
    }

    @Test
    public void testVisitaTrapezio() {
        VisitorIF visitorPE = CreatorVisitors.createVisitorPE();
        Trapezio trapezio = CreatorFiguras.createTrapezio(10, 5, 3, 5, 5);

        assertEquals(25.00, visitorPE.visitaTrapezio(trapezio), 0.1);
    }
}