package source;
import entities.Assento;

import java.util.EventObject;

public class AssentoEvent extends EventObject {
    public AssentoEvent(Assento source) {
        super(source);
    }
}
