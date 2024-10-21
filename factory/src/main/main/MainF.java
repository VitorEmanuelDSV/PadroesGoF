package main.main;

import main.contracts.SanduicheIF;
import main.factory.SanduicheBasico;
import main.factory.SanduicheFit;
import main.factory.SanduichePodrao;

public class MainF {

    public static void main(String[] args) {
        SanduicheIF sanduicheBasico = new SanduicheBasico();
        SanduicheIF sanduicheFit = new SanduicheFit();
        SanduicheIF sanduichePodrao = new SanduichePodrao();

        System.out.println("Sanduiche Básico: ");
        System.out.println(sanduicheBasico.montarSanduiche());

        System.out.println("Sanduiche Fit: ");
        System.out.println(sanduicheFit.montarSanduiche());

        System.out.println("Sanduiche Podrão: ");
        System.out.println(sanduichePodrao.montarSanduiche());
    }
}
