package source;
import entities.Assento;
import entities._Assento;

import java.util.EventObject;

public class AssentoEvent extends EventObject {
    public AssentoEvent(Assento source) {
        super(source);
    }

    public AssentoEvent(_Assento source) {
        super(source);
    }
}
