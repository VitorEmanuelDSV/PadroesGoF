package main.entities;

import main.contracts.PresuntoIF;

public class PresuntoFrango implements PresuntoIF {

    @Override
    public String getType() {
        return "Presunto de Frango \n";
    }
}
