package relationships.academic;

import java.util.ArrayList;

import entities.academic.Aluno;

public class AlunoHistorico {
    private Aluno aluno;
    private Historico historico;
    private ArrayList<AlunoHistorico> alunoHistorico;

    public AlunoHistorico(Aluno aluno, Historico historico) {
        this.aluno = aluno;
        this.historico = historico;
        alunoHistorico = new ArrayList<AlunoHistorico>();
    }
}
