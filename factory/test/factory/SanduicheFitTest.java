package factory;

import main.entities.OvoCapoeira;
import main.entities.PaoIntegral;
import main.entities.PresuntoFrango;
import main.entities.QueijoPrato;
import main.factory.SanduicheFit;
import org.junit.Test;

import static org.junit.Assert.*;

public class SanduicheFitTest {

    @Test
    public void criaPao() {
        SanduicheFit sanduicheIntegral = new SanduicheFit();
        PaoIntegral paoIntegral = new PaoIntegral();

        assertEquals(sanduicheIntegral.criaPao().getType(), paoIntegral.getType());
    }

    @Test
    public void criaQueijo() {
        SanduicheFit sanduicheIntegral = new SanduicheFit();
        QueijoPrato queijoPrato = new QueijoPrato();

        assertEquals(sanduicheIntegral.criaQueijo().getType(), queijoPrato.getType());
    }

    @Test
    public void criaPresunto() {
        SanduicheFit sanduicheIntegral = new SanduicheFit();
        PresuntoFrango presuntoFrango = new PresuntoFrango();

        assertEquals(sanduicheIntegral.criaPresunto().getType(), presuntoFrango.getType());
    }

    @Test
    public void criaOvo() {
        SanduicheFit sanduicheIntegral = new SanduicheFit();
        OvoCapoeira ovoCapoeira = new OvoCapoeira();

        assertEquals(sanduicheIntegral.criaOvo().getType(), ovoCapoeira.getType());
    }
}