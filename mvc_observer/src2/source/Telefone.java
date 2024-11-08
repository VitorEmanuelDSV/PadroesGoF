package source;

import listeners.TelefoneListener;

import java.util.ArrayList;
import java.util.List;

public class Telefone {
    private List<TelefoneListener> telefoneListeners = new ArrayList<TelefoneListener>();

    public void tocaFone() {
        disparaTelefoneTocou();
    }

    public void atendeFone() {
        disparaTelefoneAtendido();
    }

    public synchronized void addTelefoneListener(TelefoneListener l) {
        if (!telefoneListeners.contains(l)) {
            telefoneListeners.add(l);
        }
    }

    public synchronized void removeTelefoneListener(TelefoneListener l) {
        telefoneListeners.remove(l);

    }

    private void disparaTelefoneTocou() {
        List<TelefoneListener> tl;
        synchronized (this) {
            tl = (List) (((ArrayList) telefoneListeners).clone());
        }
        TelefoneEvent evento = new TelefoneEvent(this);
        for (TelefoneListener t : tl) {
            t.telefoneTocou(evento);
        }
    }

    private void disparaTelefoneAtendido() {
        List<TelefoneListener> tl;
        synchronized (this) {
            tl = (List) (((ArrayList) telefoneListeners).clone());
        }
        TelefoneEvent evento = new TelefoneEvent(this);
        for (TelefoneListener t : tl) {
            t.telefoneAtendido(evento);
        }
    }
}
