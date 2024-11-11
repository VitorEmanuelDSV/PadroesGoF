package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoSingTest {

    @Test
    public void testCirculoRaioValido() {
        CirculoSing circulo = new CirculoSing();
        circulo.setRaio(5.0);
        assertEquals(5.0, circulo.getRaio());
    }

    @Test
    public void testCirculoRaioInvalido() {
        CirculoSing circulo = new CirculoSing();
        assertThrows(IllegalArgumentException.class, () -> circulo.setRaio(-1.0));
    }
}