package controllers;

import visitors.VisitorCalculaArea;
import visitors.VisitorCalculaPerimetro;
import visitors.VisitorDesenha;
import visitors.VisitorMaximizaArea;

public class CreatorVisitors {

    public static VisitorCalculaArea createVisitorCA() {
        return new VisitorCalculaArea();
    }

    public static VisitorCalculaPerimetro createVisitorPE() {
        return new VisitorCalculaPerimetro();
    }

    public static VisitorMaximizaArea createVisitorMA() {
        return new VisitorMaximizaArea();
    }

    public static VisitorDesenha createVisitorDE() {
        return new VisitorDesenha();
    }

}
