package entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class RetanguloTest {

    @Test
    public void tryCreateRetanguloLarguraInvalid() {
        assertThrows(IllegalArgumentException.class, ()->{Retangulo retangulo = new Retangulo(3, -4);});
    }

    @Test
    public void tryCreateRetanguloAlturaInvalid() {
        assertThrows(IllegalArgumentException.class, ()->{Retangulo retangulo = new Retangulo(-3, 4);});
    }
}
