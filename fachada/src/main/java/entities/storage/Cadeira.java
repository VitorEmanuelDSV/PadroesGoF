package entities.storage;

public class Cadeira extends Material {
    public Cadeira(int id, String integridade) {
        super(id, integridade);
    }
    @Override
    public String getTipo() {
        return "Cadeira";
    }
}
