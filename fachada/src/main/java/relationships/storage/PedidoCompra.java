package relationships.storage;

public class PedidoCompra {
    private String produto;
    private int quantidade;
    private String fornecedor;

    public PedidoCompra(String produto, int quantidade, String fornecedor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }
}
