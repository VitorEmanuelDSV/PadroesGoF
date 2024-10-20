package entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrianguloTest {

    @Test
    public void tryCreateTrianguloInvalid() {
        assertThrows(IllegalArgumentException.class, ()->{Triangulo triangulo = new Triangulo(-5, -3, -4, -4);});
    }
}
