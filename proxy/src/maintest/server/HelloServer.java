package maintest.server;

import maintest.contracts.MyRemote;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            // Configura o registro RMI na porta personalizada (5555)
            LocateRegistry.createRegistry(5555);

            // Instancia e registra o serviço remoto
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("//localhost:5555/RemoteHello", service);

            System.out.println("Servidor RMI está rodando...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}