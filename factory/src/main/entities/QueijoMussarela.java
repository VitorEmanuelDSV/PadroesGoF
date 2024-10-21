package main.entities;

import main.contracts.QueijoIF;

public class QueijoMussarela implements QueijoIF {

    @Override
    public String getType() {
        return "Queijo Mussarela \n";
    }
}
