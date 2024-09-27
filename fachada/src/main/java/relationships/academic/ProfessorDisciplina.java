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

    public String getDisciplinasByProfessor(int matricula) {
        ArrayList<Disciplina> disciplinasAssociadas = new ArrayList<>();
        for (ProfessorDisciplina pd : professorDisciplinas) {
            if (pd.getProfessor().getMatricula() == matricula) {
                disciplinasAssociadas.add(pd.getDisciplina());
            }
        }
        return disciplinasAssociadas;
    }

    //Getters and Setters

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

}
