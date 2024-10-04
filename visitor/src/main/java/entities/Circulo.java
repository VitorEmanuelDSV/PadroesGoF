package entities;

import concrete.ElementoConcretoIF;
import visitors.VisitorIF;

public class Circulo implements ElementoConcretoIF {

    private double raio;

    public Circulo(double raio) {

        if ( raio <= 0 ) throw new IllegalArgumentException("Raio inválido!");

        this.raio = raio;
    }

    public void aceitaVisita(VisitorIF v) {
        v.visitaCirculo(this);
    }

    // Getters and Setters

    public double getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
