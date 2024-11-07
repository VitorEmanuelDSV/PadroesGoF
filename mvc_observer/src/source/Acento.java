package source;
import listener.AcentoListener;

import java.util.*;

public class Acento {

    private List<AcentoListener> listeners = new ArrayList<AcentoListener>();

    public void comprouAcento(){
        disparaComprarAcento();
    }

    public void reservouAcento(){
        disparaReservarAcento();
    }

    private void disparaReservarAcento() {
        List<AcentoListener> al;
        synchronized (this) {
            al = (List) (((ArrayList) listeners).clone());
        }
        AcentoEvent evento = new AcentoEvent(this);
        for (AcentoListener l : al) {
            l.reservouAcento(evento);
        }
    }
    private void disparaComprarAcento() {
        List<AcentoListener> al;
        synchronized (this) {
            al = (List) (((ArrayList) listeners).clone());
        }
        AcentoEvent evento = new AcentoEvent(this);
        for (AcentoListener l : al) {
            l.comprouAcento(evento);
        }
    }

    public synchronized void addAcentoListener(AcentoListener listener){
        if(!listeners.contains(listener)){
            listeners.add(listener);
        }
    }

    public synchronized void removeAcentoListener(AcentoListener listener){
        listeners.remove(listener);
    }
}
