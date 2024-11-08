package entities;

import listener.AssentoListener;
import listener.OnibusListener;
import source.AssentoEvent;
import source.OnibusEvent;

import java.util.ArrayList;
import java.util.List;

public class Onibus implements AssentoListener {

    private List<OnibusListener> listeners = new ArrayList<>();

    private int id;
    public List<_Assento> assentos;

    public int numeroDeAssentosX;
    public int numeroDeAssentosY;

    public Onibus(List<_Assento> assentos, int numeroDeAssentosX, int numeroDeAssentosY) {
        this.assentos = assentos;
        this.numeroDeAssentosX = numeroDeAssentosX;
        this.numeroDeAssentosY = numeroDeAssentosY;
    }

    public _Assento getAssentoById(int assentoId) {
        for (_Assento assento : assentos) {
            System.out.println("Assento ID " + assento.getId());
            if(assento.getId() == assentoId) return assento;
        }
        return null;
    }


    @Override
    public void reservouAssento(AssentoEvent e) {

    }

    @Override
    public void comprouAssento(AssentoEvent e) {

    }

    @Override
    public void mudouStatus(AssentoEvent e) {
        List<OnibusListener> al;
        synchronized (this) {
            al = new ArrayList<>(listeners);
        }

        OnibusEvent evento = new OnibusEvent(this);

        for (OnibusListener l : al) {
            l.mudouStatus(evento);
        }

    }

    // Listener
    public synchronized void addOnibusListener(OnibusListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    public synchronized void removeOnibusListener(OnibusListener listener) {
        listeners.remove(listener);
    }
}
