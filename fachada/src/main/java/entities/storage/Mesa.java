package entities.storage;

public class Mesa extends Material {
    public Mesa(int id, String integridade) {
        super(id, integridade);
    }

    @Override
    public String getTipo() {
        return "Mesa";
    }
}
