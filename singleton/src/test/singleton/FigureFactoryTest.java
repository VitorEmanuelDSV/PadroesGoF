package singleton;

import entities.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureFactoryTest {

    @Test
    public void testSingletonInstance() {
        FigureFactory factory1 = FigureFactory.getInstance();
        FigureFactory factory2 = FigureFactory.getInstance();

        assertSame(factory1, factory2);
    }

    @Test
    public void testCriarCirculoUnico() {
        FigureFactory factory = FigureFactory.getInstance();
        CirculoSing circulo1 = factory.criarCirculo();
        CirculoSing circulo2 = factory.criarCirculo();

        assertSame(circulo1, circulo2);
    }

    @Test
    public void testCriarTrianguloIsoscelesUnico() {
        FigureFactory factory = FigureFactory.getInstance();
        TrianguloIso triangulo1 = factory.criarTrianguloIsosceles();
        TrianguloIso triangulo2 = factory.criarTrianguloIsosceles();

        assertSame(triangulo1, triangulo2);
    }

    @Test
    public void testCriarTrianguloEquilateroUnico() {
        FigureFactory factory = FigureFactory.getInstance();
        TrianguloEqui triangulo1 = factory.criarTrianguloEquilatero();
        TrianguloEqui triangulo2 = factory.criarTrianguloEquilatero();

        assertSame(triangulo1, triangulo2);
    }

    @Test
    public void testCriarTrianguloRetanguloUnico() {
        FigureFactory factory = FigureFactory.getInstance();
        TrianguloRet triangulo1 = factory.criarTrianguloRetangulo();
        TrianguloRet triangulo2 = factory.criarTrianguloRetangulo();

        assertSame(triangulo1, triangulo2);
    }

    @Test
    public void testCriarQuadradoMultiplasInstancias() {
        FigureFactory factory = FigureFactory.getInstance();
        QuadradoSing quadrado1 = factory.criarQuadrado();
        QuadradoSing quadrado2 = factory.criarQuadrado();

        assertNotSame(quadrado1, quadrado2);
    }

}