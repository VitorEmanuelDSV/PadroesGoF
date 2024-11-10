package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoSingTest {

    @Test
    public void testQuadradoLadoValido() {
        QuadradoSing quadrado = new QuadradoSing();
        quadrado.setLado(4);

        assertEquals(4, quadrado.getLado());
    }

    @Test
    public void testQuadradoLadoInvalido() {
        QuadradoSing quadrado = new QuadradoSing();
        assertThrows(IllegalArgumentException.class, () -> quadrado.setLado(-3));
    }
}