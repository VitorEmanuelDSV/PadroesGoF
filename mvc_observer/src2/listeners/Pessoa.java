package listeners;

import source.Telefone;
import source.TelefoneEvent;

public class Pessoa implements TelefoneListener {
    public void telefoneTocou(TelefoneEvent e) {
        System.out.println("Eu atendo!");
        Telefone tel = (Telefone) e.getSource();
        tel.atendeFone();
    }

    public void telefoneAtendido(TelefoneEvent e) {
        System.out.println("Pessoa sabe que o telefone foi atendido");}
}
