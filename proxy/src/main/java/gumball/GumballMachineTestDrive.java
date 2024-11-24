package main.java.gumball;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count;

		if (args.length < 2) {
			System.out.println("Usage: GumballMachineTestDrive <name> <inventory>");
			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);

			// Cria o registro RMI na porta 5555
			LocateRegistry.createRegistry(5555);

			// Instancia o objeto remoto
			gumballMachine = new GumballMachine(args[0], count);

			// Registra o objeto remoto usando a porta personalizada
			String url = "rmi://localhost:5555/" + args[0] + "/gumballmachine";
			Naming.rebind(url, gumballMachine);

			System.out.println("GumballMachine is ready at " + url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
