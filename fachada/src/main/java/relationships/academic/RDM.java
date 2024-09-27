package relationships.academic;

import entities.academic.Aluno;

public class RDM {
    private Aluno aluno;

    public RDM() {}

    public String getRDMByAluno(Aluno aluno) {
        StringBuilder rdm = new StringBuilder();

        rdm.append("O aluno ")
                .append(aluno.getDados().getNome())
                .append(" tem a matricula: ")
                .append(aluno.getMatricula());

        return rdm.toString();
    }

    public static RDM createRDM() {
        return new RDM();
    }

    // Getters and Setters

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
