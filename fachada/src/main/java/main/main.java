package main;

import controllers.SIG;
import entities.admin.roles.Roles;

public class main {

    public static void main(String[] args) {

        SIG sig = new SIG(SIG.createAdmin());

        sig.createUser("Gabriel", Roles.createAdmin());

        sig.admin.createEntrevista(0, "Vitor", "0342945825", "vitin@gmail.com", "26/09/2024", "03:00PM", "virar cliente");
        sig.admin.createEntrevista(0, "Luiz", "34434334", "luizin@gmail.com", "26/09/2024", "04:00PM", "auuu");

        sig.admin.infoGetEntrevistas();

        //storage
        System.out.println("#STORAGE");
        System.out.println("-ESTOQUE");
        sig.estoque.infoGetEstoque();

        //infra
        sig.infrastructure.infoGetInfrastructure();
    }

}
