package entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrapezioTest {

    @Test
    public void tryCreateTrapezioInvalid() {
        assertThrows(IllegalArgumentException.class, ()->{Trapezio trapezio = new Trapezio(10,-5, 3, 4, 4);});
    }

    @Test
    public void tryCreateTrapezioBaseMaiorBaseMenorInvalid() {
        assertThrows(IllegalArgumentException.class, ()->{Trapezio trapezio = new Trapezio(10,15, 3, 4, 4);});
    }
}
