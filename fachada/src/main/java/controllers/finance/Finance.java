package controllers.finance;

import relationships.finance.Dashboard;
import relationships.finance.Deposito;
import relationships.finance.Extrato;
import relationships.finance.Saque;

import java.util.ArrayList;

public class Finance {

    private Dashboard dashboard = new Dashboard();
    private ArrayList<Deposito> depositos = new ArrayList<>();
    private  ArrayList<Saque> saques = new ArrayList<>();
    private Extrato extrato = new Extrato();

    public Finance() { }

    public String getFolhaDePagamento() {
        String valor = "R$ 50,00";
        String destinatario = "Gabriel";
        String descricao = "Pagamento referente ao mês de setembro";
        return "Valor: " + valor + "\nPara: " + destinatario + "\nDescrição: " + descricao;
    }

    public String getBalancoDeContas() {
        String saldo = "R$ 10.000,00";
        String entradas = "R$ 15.000,00";
        String saídas = "R$ 5.000,00";
        return "Saldo: " + saldo + "\nEntradas: " + entradas + "\nSaídas: " + saídas;
    }


}
