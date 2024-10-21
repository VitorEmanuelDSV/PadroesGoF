package main.factory;

import main.contracts.*;
import main.entities.*;

public class SanduicheFit extends SanduicheBasico{

    @Override
    public PaoIF criaPao() {
        return new PaoIntegral();
    }

    @Override
    public QueijoIF criaQueijo() {
        return new QueijoPrato();
    }

    @Override
    public PresuntoIF criaPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public OvoIF criaOvo() {
        return new OvoCapoeira();
    }

}
