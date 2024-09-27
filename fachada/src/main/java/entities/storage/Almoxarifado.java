package entities.storage;

import controllers.storage.Estoque;
import relationships.storage.PedidoCompra;

import java.util.ArrayList;
import java.util.List;

public class Almoxarifado {
    private List<Estoque> estoques;
    private List<PedidoCompra> pedidosDeCompra;

    public Almoxarifado() {
        this.estoques = new ArrayList<>();
        this.pedidosDeCompra = new ArrayList<>();
    }

    public List<Estoque> listarEstoques() {
        return this.estoques;
    }

    public List<PedidoCompra> listarPedidos() {
        return this.pedidosDeCompra;
    }
}
