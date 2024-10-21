package entities.ingredients;

import contracts.PaoIF;

public class PaoIntegral implements PaoIF {

    @Override
    public String getType() {
        return "Pão Integral \n";
    }
}
