package relationships.academic;

import java.util.ArrayList;
import entities.academic.*;

public class Historico {
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Historico() {
        this.disciplinas.add(new Disciplina(1, "MAP", "12M"));
        this.disciplinas.add(new Disciplina(2, "ES1", "34M"));
    }
}
