package entities.infrastructure;

public class Sala {
    private int id;
    private String localizacao;
    private String setor;
    private String integridade;

    public Sala(int id, String localizacao, String setor, String integridade) {
        this.id = id;
        this.localizacao = localizacao;
        this.setor = setor;
        this.integridade = integridade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getIntegridade() {
        return integridade;
    }

    public void setIntegridade(String integridade) {
        this.integridade = integridade;
    }
}
