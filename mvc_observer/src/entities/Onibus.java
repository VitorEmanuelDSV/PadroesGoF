package entities;

import listener.AssentoListener;
import listener.OnibusListener;
import source.AssentoEvent;
import source.OnibusEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Onibus implements AssentoListener {

    private List<OnibusListener> listeners = new ArrayList<>();

    private int id;
    private List<Assento> assentos = new ArrayList<>();

    public int numeroDeAssentosX;
    public int numeroDeAssentosY;

    public Onibus(int id, int numeroDeAssentosX, int numeroDeAssentosY) {
        this.id = id;
        this.numeroDeAssentosX = numeroDeAssentosX;
        this.numeroDeAssentosY = numeroDeAssentosY;
    }

    public Assento getAssentoById(int assentoId) {
        for (Assento assento : assentos) {
            System.out.println("Assento ID " + assento.getId());
            if (assento.getId() == assentoId) return assento;
        }

        throw new NoSuchElementException("Assento não encontrado!");
    }

    // Methods
    public boolean compraAssentoById(int id) {
        this.getAssentoById(id).reservaAssento();

        return true;
    }

    public boolean inativaAssentoById(int id) {
        this.getAssentoById(id).inativaAssento();

        return true;
    }

    public boolean disponibilizaAssentoById(int id) {
        this.getAssentoById(id).disponibilizaAssento();

        return true;
    }

    public Assento createAssento(int id, int positionX, int positionY) {

        for (Assento assento : this.assentos) {
            if (assento.getId() == id) {
                throw new IllegalArgumentException("ID já existente!" + id);
            } else if (assento.getPositionX() == positionX && assento.getPositionY() == positionY) {
                throw new IllegalArgumentException("Assento já existente nessa posição! - [" + assento.getId() + "]");
            } else if (this.numeroDeAssentosX <= positionX || this.numeroDeAssentosX <= positionY) {
                throw new IllegalArgumentException("Assento " + id + " em posição inválida!");
            }
        }

        Assento _assento = new Assento(id, positionX, positionY);

        this.assentos.add(_assento);

        return _assento;
    }

    // Interface
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

    // Getters and Setters
    public List<Assento> getAssentos() {
        return this.assentos;
    }

    public int getId() {
        return id;
    }
}
