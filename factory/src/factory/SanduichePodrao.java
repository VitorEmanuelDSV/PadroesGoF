package factory;

import contracts.PaoIF;
import contracts.QueijoIF;
import entities.ingredients.PaoBola;
import entities.ingredients.QueijoCheddar;

public class SanduichePodrao extends SanduicheBasico{

    public PaoIF criaPao() {
        return new PaoBola();
    }

    public QueijoIF criaQueijo() {
        return new QueijoCheddar();
    }
}
