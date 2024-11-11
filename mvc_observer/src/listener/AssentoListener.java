package listener;
import source.AssentoEvent;

import java.util.EventListener;

public interface AssentoListener extends EventListener {

    public void mudouStatus(AssentoEvent e);

}
