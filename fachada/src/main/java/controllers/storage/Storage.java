package controllers.storage;

import entities.storage.Almoxarifado;
import relationships.storage.PedidoCompra;

import java.util.List;

public class Storage {
    private Almoxarifado almoxarifado;

    public Storage() {
        this.almoxarifado = new Almoxarifado();
    }

    public List<Estoque> listarEstoques() {
        return almoxarifado.listarEstoques();
    }

    public List<PedidoCompra> listarPedidosDeCompra() {
        return almoxarifado.listarPedidos();
    }
}
