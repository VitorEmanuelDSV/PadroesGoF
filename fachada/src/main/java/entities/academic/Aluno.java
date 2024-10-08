package entities.academic;

import relationships.academic.Historico;
import relationships.academic.RDM;

public class Aluno {
    private int matricula;
    private Dados dados;
    private Historico historico;
    private RDM rdm;

    public Aluno(int matricula, Dados dados, Historico historico, RDM rdm) {
        this.matricula = matricula;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}