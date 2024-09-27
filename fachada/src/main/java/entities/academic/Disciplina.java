package entities.academic;

public class Disciplina {
    private int codigo;
    private String nome;
    private String horario;

    public Disciplina(int codigo, String nome, String horario) {
        this.codigo = codigo;
        this.nome = nome;
        this.horario = horario;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
