package main.java.gumball;

import java.rmi.*;

public class GumballMonitorTestDrive {

	public static void main(String[] args) {
		// URLs para localização do objeto remoto usando a porta personalizada 5555
		String[] location = {
				"rmi://localhost:5555/santafe.mightygumball.com/gumballmachine",
				"rmi://localhost:5555/boulder.mightygumball.com/gumballmachine",
				"rmi://localhost:5555/austin.mightygumball.com/gumballmachine"
		};

		// Se argumentos forem fornecidos, usa o host passado no argumento
		if (args.length > 0) {
			location = new String[1];
			location[0] = "rmi://localhost:5555/" + args[0] + "/gumballmachine";
		}

		GumballMonitor[] monitor = new GumballMonitor[location.length];

		for (int i = 0; i < location.length; i++) {
			try {
				// Localiza o objeto remoto pelo URL
				GumballMachineRemote machine =
						(GumballMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
				System.out.println("Connected to " + location[i]);
				System.out.println(monitor[i]);
			} catch (Exception e) {
				System.out.println("Failed to connect to " + location[i]);
				e.printStackTrace();
			}
		}

		for (int i = 0; i < monitor.length; i++) {
			if (monitor[i] != null) {
				monitor[i].report();
			}
		}
	}
}
