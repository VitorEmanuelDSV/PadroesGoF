package entities;

import contracts.OvoIF;

public class OvoGranja implements OvoIF {

    @Override
    public String getType() {
        return "Ovo de Granja \n";
    }
}