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

    public String getDisciplinasByMatricula(int matricula) {
        StringBuilder disciplinasAssociadas = new StringBuilder();

        for (ProfessorDisciplina pd : professorDisciplinas) {
            if (pd.getProfessor().getMatricula() == matricula) {
                disciplinasAssociadas.append(pd.getDisciplina().getNome());
            }
        }

        return disciplinasAssociadas.toString();
    }

    public String getDisciplinasProfessor(Professor professor) {
        StringBuilder disciplinasAssociadas = new StringBuilder();

        disciplinasAssociadas.append("O professor ")
                .append(professor.getDados().getNome())
                .append(" ministra as disciplinas: ")
                .append(getDisciplinasByMatricula(professor.getMatricula()));

        return disciplinasAssociadas.toString();
    }

    public String tempoDeCasa (Professor professor) {
        StringBuilder tempo = new StringBuilder();

        tempo.append("O professor ")
                .append(professor.getDados().getNome())
                .append(" tem ")
                .append(professor.getTempoDeCasa())
                .append(" anos que ministra na universidade estadual da Paraiba.");

        return tempo.toString();
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
