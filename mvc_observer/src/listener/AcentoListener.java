package listener;
import source.AcentoEvent;

import java.util.EventListener;

public interface AcentoListener extends EventListener {

    public void reservouAcento(AcentoEvent e);
    public void comprouAcento(AcentoEvent e);

}
