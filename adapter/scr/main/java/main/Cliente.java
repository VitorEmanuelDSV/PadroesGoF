package main;

public class Cliente {

    private ListIF<String> listAdapter;
    private MapIF<Integer, String> mapAdapter;

    public Cliente(ListIF<String> listAdapter) {
        this.listAdapter = listAdapter;
    }

    public Cliente(MapIF<Integer, String> mapAdapter) {
        this.mapAdapter = mapAdapter;
    }



}
