package listeners;

import source.TelefoneEvent;

public interface TelefoneListener extends java.util.EventListener {
    void telefoneTocou(TelefoneEvent e);
    void telefoneAtendido(TelefoneEvent e);
}
