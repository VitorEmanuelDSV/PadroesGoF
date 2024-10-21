package factory;

import main.entities.PaoBola;
import main.entities.QueijoCheddar;
import main.factory.SanduichePodrao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SanduichePodraoTest {

    @Test
    public void criaPao() {
        SanduichePodrao sanduichePodrao = new SanduichePodrao();
        PaoBola paoBola = new PaoBola();

        assertEquals(sanduichePodrao.criaPao().getType(), paoBola.getType());
    }

    @Test
    public void criaQueijo() {
        SanduichePodrao sanduichePodrao = new SanduichePodrao();
        QueijoCheddar queijoCheddar = new QueijoCheddar();

        assertEquals(sanduichePodrao.criaQueijo().getType(), queijoCheddar.getType());
    }
}