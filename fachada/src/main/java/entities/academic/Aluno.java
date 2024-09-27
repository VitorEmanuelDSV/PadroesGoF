package entities.academic;

import relationships.academic.Historico;
import relationships.academic.RDM;

public class Aluno {
    private Dados dados;
    private Historico historico;
    private RDM rdm;

    public Aluno(Dados dados, Historico historico, RDM rdm) {
        this.dados = dados;
        this.historico = historico;
        this.rdm = rdm;
    }

    // Getters and Setters

    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }
    
    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public RDM getRdm() {
        return rdm;
    }

    public void setRdm(RDM rdm) {
        this.rdm = rdm;
    }
}