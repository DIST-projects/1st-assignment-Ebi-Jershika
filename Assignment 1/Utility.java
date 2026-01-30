import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Utility extends Remote {
    String reverseString(String s) throws RemoteException;
    int findMax(int[] arr) throws RemoteException;
    int square(int n) throws RemoteException;
}
