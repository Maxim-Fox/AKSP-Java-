import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(null);
            Hello stub = (Hello) registry.lookup("Hello");
            stub.printMessage();
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
