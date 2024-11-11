package listeners;

import source.TelefoneEvent;

public class SecretariaEletronica implements TelefoneListener {
    public void telefoneTocou(TelefoneEvent e) {
        System.out.println("Secretaria escuta telefone tocando.");}

    public void telefoneAtendido(TelefoneEvent e) {
        System.out.println("Secretaria sabe que foi atendido");}
}
