package entities.ingredients;

import contracts.QueijoIF;

public class QueijoCheddar implements QueijoIF {

    @Override
    public String getType() {
        return "Queijo Cheddar \n";
    }
}
