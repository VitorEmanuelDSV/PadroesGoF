package factory;

import entities.builder.Sanduiche;
import entities.ingredients.*;

import java.util.ArrayList;

public class SanduicheFactory {

    public static Sanduiche getSanduiche(
            String pao,
            String queijo,
            String presunto,
            String ovo,
            boolean tomate
    ) {

        ArrayList<Ingredient> ingredientes = new ArrayList<>();

        ingredientes.add(new Pao(pao));
        ingredientes.add(new Queijo(queijo));
        ingredientes.add(new Presunto(presunto));
        ingredientes.add(new Ovo(ovo));
        ingredientes.add(new Tomate(tomate));

        return new Sanduiche(ingredientes);

    }


}
