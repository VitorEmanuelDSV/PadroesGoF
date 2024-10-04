package relationships.academic;

import entities.academic.*;

import java.util.ArrayList;

public class ProfessorDisciplina {
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<ProfessorDisciplina> professorDisciplinas;

    public ProfessorDisciplina(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        professorDisciplinas = new ArrayList<ProfessorDisciplina>();
    }

    public void associarProfessorDisciplina(Professor professor, Disciplina disciplina) {
        professorDisciplinas.add(new ProfessorDisciplina(professor, disciplina));
    }

    public String getDisciplinas() {
        StringBuilder disciplinas = new StringBuilder();


        return null;
    }

    public String getDisciplinasProfessor() {
        StringBuilder disciplinasProfessor = new StringBuilder();

        disciplinasProfessor.append("As disciplinas que ")
        .append(this.professor.getDados().getNome())
        .append(" ministra são: ");

        return null;
    }
}
