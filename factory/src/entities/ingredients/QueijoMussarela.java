package entities.ingredients;

import contracts.QueijoIF;

public class QueijoMussarela implements QueijoIF {

    @Override
    public String getType() {
        return "Queijo Mussarela \n";
    }
}
