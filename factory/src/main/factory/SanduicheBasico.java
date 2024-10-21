package main.factory;

import main.contracts.*;
import main.entities.*;

public class SanduicheBasico implements SanduicheIF {

    public PaoIF criaPao() {
        return new PaoFrances();
    }

    public QueijoIF criaQueijo() {
        return new QueijoMussarela();
    }

    public PresuntoIF criaPresunto() {
        return new PresuntoPeru();
    }

    public OvoIF criaOvo() {
        return new OvoGranja();
    }

    public Tomate criaTomate() {
        return new Tomate();
    }

    @Override
    public String montarSanduiche() {
        StringBuilder sanduicheBasico = new StringBuilder();

        sanduicheBasico.append("O sanduiche é formado por: \n")
                .append(criaPao().getType())
                .append(criaQueijo().getType())
                .append(criaPresunto().getType())
                .append(criaOvo().getType())
                .append(criaTomate().getType())
                .append(criaPao().getType());

        return sanduicheBasico.toString();
    }
}
