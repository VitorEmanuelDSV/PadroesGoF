package maintest.client;

import maintest.contracts.MyRemote;

import java.rmi.Naming;

public class HelloClient {
    public static void main(String[] args) {
        try {
            // Localiza o serviço remoto
            MyRemote service = (MyRemote) Naming.lookup("//localhost:5555/RemoteHello");

            // Invoca o método remoto
            System.out.println(service.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
