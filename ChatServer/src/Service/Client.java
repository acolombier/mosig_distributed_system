package Service;

import java.rmi.*;

import Model.Message;

public interface Client extends Remote {
	void send(Message m) throws RemoteException;
	String getName() throws RemoteException;
}