package main.entities;

import main.contracts.PresuntoIF;

public class PresuntoPeru implements PresuntoIF {

    @Override
    public String getType() {
        return "Presunto de Peru \n";
    }
}
