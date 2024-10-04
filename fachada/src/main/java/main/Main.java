package main;

import controllers.SIG;
import entities.admin.roles.Roles;

public class Main {

    public static void main(String[] args) {

        SIG sig = new SIG(SIG.createAdmin());

        sig.createUser("Gabriel", Roles.createAdmin());
        sig.createUser("Caleb", Roles.createDiretor());

        // Administrativo
        System.out.println("\n# ADMINISTRATIVO: ");
        System.out.println("- Entrevistas: ");
        sig.admin.createEntrevista(0, "Vitor", "0342945825", "vitin@gmail.com", "26/09/2024", "03:00PM", "Testar o sistema");
        sig.admin.createEntrevista(0, "Luiz", "34434334", "luizin@gmail.com", "26/09/2024", "04:00PM", "Contratação");

        System.out.print(sig.admin.infoGetEntrevistas());

        System.out.println("- Reuniões");
        sig.admin.mockReuniao();

        System.out.print(sig.admin.infoGetReunioes());

        // Finance
        System.out.println("# FINANCEIRO: ");
        System.out.println("- Balanço de Contas: ");
        System.out.println(sig.finance.getBalancoDeContas() + "\n");

        System.out.println("- Folha de Pagamento: ");
        System.out.println(sig.finance.getFolhaDePagamento() + "\n");


        // Storage
        System.out.println("# STORAGE");
        System.out.println("- Estoque");
        sig.estoque.infoGetEstoque();

        // Infraestrutura
        sig.infrastructure.infoGetInfrastructure();

        // Academic
        sig.academic.printDisciplinasProfessor();
        sig.academic.printTempoDeCasa();

        sig.academic.printHistoricoAluno();
        sig.academic.printRDM();
    }

}
