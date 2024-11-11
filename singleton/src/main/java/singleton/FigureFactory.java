package singleton;

import entities.*;

public class FigureFactory {
    private static FigureFactory instancia;

    private CirculoSing circulo;
    private TrianguloIso trianguloIsosceles;
    private TrianguloEqui trianguloEquilatero;
    private TrianguloRet trianguloRetangulo;

    private FigureFactory() {}

    public static FigureFactory getInstance() {
        if (instancia == null) {
            instancia = new FigureFactory();
        }
        return instancia;
    }

    public CirculoSing criarCirculo() {
        if (circulo == null) {
            circulo = new CirculoSing();
        }
        return circulo;
    }

    public TrianguloIso criarTrianguloIsosceles() {
        if (trianguloIsosceles == null) {
            trianguloIsosceles = new TrianguloIso();
        }
        return trianguloIsosceles;
    }

    public TrianguloEqui criarTrianguloEquilatero() {
        if (trianguloEquilatero == null) {
            trianguloEquilatero = new TrianguloEqui();
        }
        return trianguloEquilatero;
    }

    public TrianguloRet criarTrianguloRetangulo() {
        if (trianguloRetangulo == null) {
            trianguloRetangulo = new TrianguloRet();
        }
        return trianguloRetangulo;
    }

    public QuadradoSing criarQuadrado() {
        return new QuadradoSing();
    }
}
