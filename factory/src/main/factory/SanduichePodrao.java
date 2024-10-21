package main.factory;

import main.contracts.PaoIF;
import main.contracts.QueijoIF;
import main.entities.PaoBola;
import main.entities.QueijoCheddar;

public class SanduichePodrao extends SanduicheBasico{

    public PaoIF criaPao() {
        return new PaoBola();
    }

    public QueijoIF criaQueijo() {
        return new QueijoCheddar();
    }
}
