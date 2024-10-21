package main.entities;

import main.contracts.PaoIF;

public class PaoFrances implements PaoIF {

    @Override
    public String getType() {
        return "Pão Francês \n";
    }
}
