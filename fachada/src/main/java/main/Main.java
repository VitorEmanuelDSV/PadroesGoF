package main;

import controllers.SIG;
import entities.admin.roles.Roles;

public class Main {

    public static void main(String[] args) {

        SIG sig = new SIG(SIG.createAdmin());

        sig.createUser("Gabriel", Roles.createAdmin());
        sig.createUser("Caleb", Roles.createDiretor());

        System.out.println("# ADMINISTRATIVO: ");
        System.out.println("- Entrevistas: ");
        sig.admin.createEntrevista(0, "Vitor", "0342945825", "vitin@gmail.com", "26/09/2024", "03:00PM", "virar cliente");
        sig.admin.createEntrevista(0, "Luiz", "34434334", "luizin@gmail.com", "26/09/2024", "04:00PM", "auuu");

        System.out.println(sig.admin.infoGetEntrevistas());

        System.out.println("- Reuniões");
        sig.admin.mockReuniao();

        System.out.println(sig.admin.infoGetReunioes());

        //storage
        System.out.println("#STORAGE");
        System.out.println("-ESTOQUE");
        sig.estoque.infoGetEstoque();

        //infra
        sig.infrastructure.infoGetInfrastructure();
    }

}
