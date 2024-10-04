package controllers.academic;

import entities.academic.Aluno;
import entities.academic.Dados;
import entities.academic.Disciplina;
import entities.academic.Professor;
import relationships.academic.*;

public class Academic {
    private RDM rdm = new RDM();

    private Disciplina disciplina1 = new Disciplina(1, "MAP", "12M6");
    private Disciplina disciplina2 = new Disciplina(2, "ES1", "34M6");

    private Professor professor1 = new Professor(new Dados("Jao", "1223", "Jao@gmail.com"), 3.5);
    private Historico historico = new Historico();
    private Aluno aluno1 = new Aluno(1234, new Dados("Junio", "5555", "Junio@gmail.com"), historico, RDM.createRDM());

    private AlunoHistorico alunoHistorico = new AlunoHistorico(aluno1, AlunoHistorico.createHistorico());
    private ProfessorDisciplina professorDisciplina = new ProfessorDisciplina(professor1, disciplina1);


    public Academic() {
        historico.addDisciplina(disciplina1);
        historico.addDisciplina(disciplina2);
        alunoHistorico.addAlunoHistorico(aluno1, historico);

        professorDisciplina.associarProfessorDisciplina(professor1, disciplina1);

        rdm.getRDMByAluno(aluno1);
    }

    public void printDisciplinasProfessor() {
        System.out.println(professorDisciplina.getDisciplinasProfessor(professor1));
    }

    public void printTempoDeCasa() {
        System.out.println(professorDisciplina.tempoDeCasa(professor1));
    }

    public void printHistoricoAluno() {
        System.out.println(alunoHistorico.getHistoricoByAluno(aluno1));
    }

    public void printRDM() {
        System.out.println(rdm.getRDMByAluno(aluno1));
    }
}
