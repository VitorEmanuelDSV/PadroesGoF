package listener;
import source.AssentoEvent;

import java.util.EventListener;

public interface AssentoListener extends EventListener {

    public void reservouAssento(AssentoEvent e);
    public void comprouAssento(AssentoEvent e);


    public void mudouStatus(AssentoEvent e);

}
