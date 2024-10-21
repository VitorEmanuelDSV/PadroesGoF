package main.entities;

import main.contracts.QueijoIF;

public class QueijoPrato implements QueijoIF {

    @Override
    public String getType() {
        return "Queijo Prato \n";
    }
}
