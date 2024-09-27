package entities.academic;

public class Professor {
    private Dados dados;
    private float tempoDeCasa;

    public Professor(Dados dados, float tempoDeCasa) {
        this.dados = dados;
        this.tempoDeCasa = tempoDeCasa;
    }

    public Dados getDados() {
        return this.dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public float getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(float tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }
}
