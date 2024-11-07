package source;

import listener.AcentoListener;
import java.util.ArrayList;
import java.util.List;

public class Acento {
    private List<AcentoListener> listeners = new ArrayList<>();
    private String status; //disponível reservado comprado

    public Acento() {
        this.status = "Disponível"; // no começo o assento está disponível
    }

    public String getStatus() {
        return status;
    }

    public void reservarAcento() {
        this.status = "Reservado";
        disparaReservarAcento();
    }

    public void comprarAcento() {
        this.status = "Comprado";
        disparaComprarAcento();
    }

    private void disparaReservarAcento() {
        List<AcentoListener> al;
        synchronized (this) {
            al = new ArrayList<>(listeners);
        }
        AcentoEvent evento = new AcentoEvent(this);
        for (AcentoListener l : al) {
            l.reservouAcento(evento);
        }
    }

    private void disparaComprarAcento() {
        List<AcentoListener> al;
        synchronized (this) {
            al = new ArrayList<>(listeners);
        }
        AcentoEvent evento = new AcentoEvent(this);
        for (AcentoListener l : al) {
            l.comprouAcento(evento);
        }
    }

    public synchronized void addAcentoListener(AcentoListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    public synchronized void removeAcentoListener(AcentoListener listener) {
        listeners.remove(listener);
    }
}
