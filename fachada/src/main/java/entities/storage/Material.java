package entities.storage;

public class Material {
    private int id;
    private String integridade;

    public Material(int id, String integridade) {
        this.id = id;
        this.integridade = integridade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntegridade() {
        return integridade;
    }

    public void setIntegridade(String integridade) {
        this.integridade = integridade;
    }

    public String getTipo() {
        return "Material";
    }

}
