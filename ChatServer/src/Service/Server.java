package Service;

import java.rmi.*;
import java.util.ArrayList;

import Model.Message;
import Model.MessageBundle;

public interface Server extends Remote {
	boolean register(Client c) throws RemoteException;
	void unregister(String c) throws RemoteException;
	Message[] pull() throws RemoteException;
	Message push(MessageBundle m) throws RemoteException;
}
