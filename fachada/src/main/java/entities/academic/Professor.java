package entities.academic;

public class Professor {
    private int matricula;
    private Dados dados;
    private double tempoDeCasa;

    public Professor(Dados dados, double tempoDeCasa) {
        this.dados = dados;
        this.tempoDeCasa = tempoDeCasa;
    }

    public Dados getDados() {
        return this.dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public double getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(double tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
