package main.entities;

import main.contracts.QueijoIF;

public class QueijoCheddar implements QueijoIF {

    @Override
    public String getType() {
        return "Queijo Cheddar \n";
    }
}
