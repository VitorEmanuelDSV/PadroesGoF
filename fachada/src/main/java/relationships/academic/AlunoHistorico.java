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

    public static Historico createHistorico() {
        return new Historico();
    }

    public AlunoHistorico addAlunoHistorico(Aluno aluno, Historico historico) {
        AlunoHistorico alunoHistoricoAux = new AlunoHistorico(aluno, historico);
        alunoHistorico.add(alunoHistoricoAux);
        return alunoHistoricoAux;
    }

    public String getHistoricoByAluno(Aluno aluno) {
        StringBuilder historicoAluno = new StringBuilder();

        for (AlunoHistorico alunoHistorico : alunoHistorico) {
            if (alunoHistorico.getAluno().equals(aluno)){
                historicoAluno.append("As disciplinas que ")
                        .append(aluno.getDados().getNome())
                        .append(" ja cursou foram: ")
                        .append(alunoHistorico.getHistorico().getHistorico());
            }
        }

        return historicoAluno.toString();
    }

    // Getters and Setters

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

}
