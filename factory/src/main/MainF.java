package main;

import entities.builder.Sanduiche;
import factory.SanduicheFactory;

public class MainF {

    public static void main(String[] args) {

        Sanduiche sanduiche1 = SanduicheFactory.getSanduiche("integral", "prato", "frango", "granja", true);
        Sanduiche sanduiche2 = SanduicheFactory.getSanduiche("frances", "prato", "peru", "capoeira", true);
        Sanduiche sanduiche3 = SanduicheFactory.getSanduiche("bola", "prato", "peru", "granja", false);

        System.out.println(sanduiche1.getSanduiche());
        System.out.println(sanduiche2.getSanduiche());
        System.out.println(sanduiche3.getSanduiche());

    }
}
