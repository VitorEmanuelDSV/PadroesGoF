package entities.storage;

public class Quadro extends Material{
    public Quadro(int id, String integridade) {
        super(id, integridade);
    }

    @Override
    public String getTipo() {
        return "Quadro";
    }
}
