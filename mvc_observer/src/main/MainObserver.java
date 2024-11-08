package main;

import entities.Onibus;
import entities._Assento;
import listener.PainelCentral;
import entities.Assento;
import listener._PainelCentral;

import java.util.ArrayList;

public class MainObserver {
    public static void main(String[] args) {
//        Assento assento = new Assento();
//        PainelCentral painel = new PainelCentral(4, 4);
//
//        assento.addAcentoListener(painel);
//        painel.comprarAcento(2,1);
//        painel.comprarAcento(2,1);
//        painel.exibirStatusAcentos();

        _PainelCentral painel = new _PainelCentral();

        ArrayList<_Assento> assentos = new ArrayList<_Assento>();
        _Assento assento = new _Assento(2, 1, 1);
        System.out.println(assento.getId());

        assentos.add(assento);

        Onibus onibus = new Onibus(assentos, 4, 4);

        assento.setOnibusListener(onibus);

        onibus.addOnibusListener(painel);

        assento.compraAssento();




    }
}
