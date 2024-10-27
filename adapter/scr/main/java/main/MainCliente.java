package main;
import java.util.*;

public class MainCliente {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        ListIF<Map.Entry<Integer, String>> listaAdaptada = new MapToListAdapter<>(mapa);

        listaAdaptada.add(new AbstractMap.SimpleEntry<>(1, "Valor 1"));
        listaAdaptada.add(new AbstractMap.SimpleEntry<>(2, "Valor 2"));

        System.out.println("Elementos no mapa (acessados via adaptador de lista):");
        Iterator<Map.Entry<Integer, String>> it = listaAdaptada.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        listaAdaptada.remove(new AbstractMap.SimpleEntry<>(1, "Valor 1"));

        System.out.println("Tamanho do mapa após remoção: " + listaAdaptada.size());

        List<String> lista = new ArrayList<>();
        ListToMapAdapter<Integer, String> mapaAdaptado = new ListToMapAdapter<>(lista);

        mapaAdaptado.put(0, "Elemento 1");
        mapaAdaptado.put(1, "Elemento 2");

        System.out.println("\nElementos na lista (acessados via adaptador de mapa):");
        System.out.println("Chave 0: " + mapaAdaptado.get(0));
        System.out.println("Chave 1: " + mapaAdaptado.get(1));

        mapaAdaptado.remove(0);

        System.out.println("Tamanho da lista após remoção: " + mapaAdaptado.size());

        System.out.println("Elementos restantes na lista:");
        for (String valor : mapaAdaptado.values()) {
            System.out.println(valor);
        }

    }

}
