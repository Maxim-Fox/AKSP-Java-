import java.rmi.RemoteException;

public class HelloImpl implements Hello{
    @Override
    public void printMessage() throws RemoteException {
        System.out.println("Hello!");
    }
}
