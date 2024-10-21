package main.entities;

import main.contracts.OvoIF;

public class OvoCapoeira implements OvoIF {

    @Override
    public String getType() {
        return "Ovo de capoeira \n";
    }
}