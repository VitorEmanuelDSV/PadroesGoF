package factory;

import main.entities.*;
import main.factory.SanduicheBasico;
import org.junit.Test;

import static org.junit.Assert.*;

public class SanduicheBasicoTest {

    @Test
    public void criaPao() {
        SanduicheBasico sanduicheBasico = new SanduicheBasico();
        PaoFrances paoFrances = new PaoFrances();

        assertEquals(sanduicheBasico.criaPao().getType(), paoFrances.getType());
    }

    @Test
    public void criaQueijo() {
        SanduicheBasico sanduicheBasico = new SanduicheBasico();
        QueijoMussarela queijoMussarela = new QueijoMussarela();

        assertEquals(sanduicheBasico.criaQueijo().getType(), queijoMussarela.getType());
    }

    @Test
    public void criaPresunto() {
        SanduicheBasico sanduicheBasico = new SanduicheBasico();
        PresuntoPeru presuntoPeru = new PresuntoPeru();

        assertEquals(sanduicheBasico.criaPresunto().getType(), presuntoPeru.getType());
    }

    @Test
    public void criaOvo() {
        SanduicheBasico sanduicheBasico = new SanduicheBasico();
        OvoGranja ovoGranja = new OvoGranja();

        assertEquals(sanduicheBasico.criaOvo().getType(), ovoGranja.getType());
    }

    @Test
    public void criaTomate() {
        SanduicheBasico sanduicheBasico = new SanduicheBasico();
        Tomate tomate = new Tomate();

        assertEquals(sanduicheBasico.criaTomate().getType(), tomate.getType());
    }
}