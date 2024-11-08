package source;

import entities.Onibus;

import java.util.EventObject;

public class OnibusEvent extends EventObject {

    public OnibusEvent(Onibus source) {
        super(source);
    }

}
