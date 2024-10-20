package entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class CirculoTest {

    @Test
    public void tryCreateCirculoInvalid() {
        assertThrows(IllegalArgumentException.class, ()->{Circulo circulo = new Circulo(-4);});
    }
}
