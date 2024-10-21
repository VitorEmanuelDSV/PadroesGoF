package main.entities;

import main.contracts.PaoIF;

public class PaoBola implements PaoIF {

    @Override
    public String getType() {
        return "Pão Bola \n";
    }
}
