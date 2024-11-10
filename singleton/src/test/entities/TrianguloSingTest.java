package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloSingTest {

    @Test
    public void testTrianguloLadosValidos() {
        TrianguloIso triangulo = new TrianguloIso();
        triangulo.setBase(5.0);
        triangulo.setLado1(4.0);
        triangulo.setLado2(3.0);

        assertEquals(5.0, triangulo.getBase());
        assertEquals(4.0, triangulo.getLado1());
        assertEquals(3.0, triangulo.getLado2());
    }

    @Test
    public void testTrianguloDesigualdadeTriangularInvalida() {
        TrianguloIso triangulo = new TrianguloIso();
        triangulo.setBase(10.0);
        triangulo.setLado1(3.0);

        assertThrows(IllegalArgumentException.class, () -> triangulo.setLado2(2.0));
    }
}