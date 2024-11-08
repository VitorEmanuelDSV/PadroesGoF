package entities;

import listener.AssentoListener;
import source.AssentoEvent;

public class _Assento {

    private AssentoListener onibus;

    public int id;
    public int positionX;
    public int positionY;
    private String status; // DISPONIVEL | RESERVADO | INDISPONÍVEL

    public _Assento(int id, int x, int y) {
        this.id = id;
        this.positionX = x;
        this.positionY = y;
        this.status = "DISPONIVEL";
    }

    public void compraAssento() {
        if(this.status.equals("DISPONIVEL")) {
            this.setStatus("RESERVADO");
        }
        else {

        }
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

    // Listener
    public synchronized void setOnibusListener(AssentoListener listener) {
        this.onibus = listener;
    }

    public synchronized void removeOnibusListener() {
        this.onibus = null;
    }

}
