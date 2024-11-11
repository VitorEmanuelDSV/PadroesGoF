package entities;

import listener.AssentoListener;
import source.AssentoEvent;

public class Assento {

    private AssentoListener onibus;

    private int id;
    private int positionX;
    private int positionY;
    private String status; // DISPONIVEL | RESERVADO | INDISPONÍVEL

    public Assento(int id, int x, int y) {
        this.id = id;
        this.positionX = x;
        this.positionY = y;
        this.status = "DISPONIVEL";
    }

    public void reservaAssento() {
        switch (this.status) {
            case "DISPONIVEL" -> this.setStatus("RESERVADO");
            case "RESERVADO" -> throw new IllegalArgumentException("O assento já está reservado!");
            case "INDISPONIVEL" -> throw new IllegalArgumentException("O assento está indisponível!");
        }
    }

    public void inativaAssento() {
        this.setStatus("INDISPONIVEL");
    }

    public void disponibilizaAssento() {
        this.setStatus("DISPONIVEL");
    }

    // Listener
    public synchronized void setAssentoListener(AssentoListener listener) {
        this.onibus = listener;
    }

    public synchronized void removeAssentoListener() {
        this.onibus = null;
    }

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;

        AssentoEvent evento = new AssentoEvent(this);
        onibus.mudouStatus(evento);
    }

    public int getId() {
        return this.id;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

}
