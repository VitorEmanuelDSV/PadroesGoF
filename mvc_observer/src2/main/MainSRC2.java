package main;

import listeners.Pessoa;
import listeners.SecretariaEletronica;
import source.Telefone;

public class MainSRC2 {

    public static void main(String[] args) {
        Telefone fone = new Telefone();
        Pessoa fulano = new Pessoa();
        SecretariaEletronica se = new SecretariaEletronica();

        fone.addTelefoneListener(fulano);
        fone.addTelefoneListener(se);

        fone.tocaFone();
    }
}
