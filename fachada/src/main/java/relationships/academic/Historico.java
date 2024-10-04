package relationships.academic;

import java.util.ArrayList;
import entities.academic.*;

public class Historico {
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Historico() {}

    public String getHistorico() {
        StringBuilder historico = new StringBuilder();

        for (Disciplina disciplina : disciplinas) {
            historico.append(disciplina.getNome()).append(", ");
        }

        historico.deleteCharAt(historico.length() - 2);

        return historico.toString();
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }
}
