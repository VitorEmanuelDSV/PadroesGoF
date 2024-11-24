package maintest.contracts;

import java.rmi.*;

public interface MyRemote extends Remote {
    // O "extends Remote" indica que está interface será usada para chamadas remotas.
    public String sayHello() throws RemoteException;
    // Toda chamada de métodos remotos é considerada "arriscada".
    // Por isso, todo método deve possuir o throws RemoteException
}


