package entities;

import listener.AssentoListener;
import source.AssentoEvent;

import java.util.ArrayList;
import java.util.List;

public class Assento {
    private List<AssentoListener> listeners = new ArrayList<>();
    private String status; //disponível reservado comprado

    public Assento() {
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
        List<AssentoListener> al;
        synchronized (this) {
            al = new ArrayList<>(listeners);
        }
        AssentoEvent evento = new AssentoEvent(this);
        for (AssentoListener l : al) {
            l.reservouAssento(evento);
        }
    }

    private void disparaComprarAcento() {
        List<AssentoListener> al;
        synchronized (this) {
            al = new ArrayList<>(listeners);
        }
        AssentoEvent evento = new AssentoEvent(this);
        for (AssentoListener l : al) {
            l.comprouAssento(evento);
        }
    }

    public synchronized void addAcentoListener(AssentoListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    public synchronized void removeAcentoListener(AssentoListener listener) {
        listeners.remove(listener);
    }
}
