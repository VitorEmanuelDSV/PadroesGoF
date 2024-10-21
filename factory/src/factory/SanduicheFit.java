package factory;

import contracts.OvoIF;
import contracts.PaoIF;
import contracts.PresuntoIF;
import contracts.QueijoIF;
import entities.ingredients.OvoCapoeira;
import entities.ingredients.PaoIntegral;
import entities.ingredients.PresuntoFrango;
import entities.ingredients.QueijoPrato;

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
