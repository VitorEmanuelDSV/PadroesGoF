package listener;

import source.AcentoEvent;

public class PainelCentral implements AcentoListener{

    @Override
    public void comprouAcento(AcentoEvent e) {
        System.out.println("Comprou Acento");
    }
    @Override
    public void reservouAcento(AcentoEvent e) {
        System.out.println("Reservou Acento");
    }
}
