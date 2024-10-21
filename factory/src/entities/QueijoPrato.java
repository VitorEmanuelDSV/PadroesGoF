package entities;

import contracts.QueijoIF;

public class QueijoPrato implements QueijoIF {

    @Override
    public String getType() {
        return "Queijo Prato \n";
    }
}
