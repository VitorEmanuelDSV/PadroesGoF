package main;

import listener.PainelCentral;
import source.Acento;

public class MainObserver {
    public static void main(String[] args) {
        Acento acento = new Acento();
        PainelCentral painel = new PainelCentral(4, 4);

        acento.addAcentoListener(painel);
        painel.comprarAcento(2,1);
        painel.exibirStatusAcentos();
    }
}
