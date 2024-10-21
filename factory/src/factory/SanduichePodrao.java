package factory;

import contracts.PaoIF;
import contracts.QueijoIF;
import entities.PaoBola;
import entities.QueijoCheddar;

public class SanduichePodrao extends SanduicheBasico{

    public PaoIF criaPao() {
        return new PaoBola();
    }

    public QueijoIF criaQueijo() {
        return new QueijoCheddar();
    }
}
