import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class UtilityImpl extends UnicastRemoteObject implements Utility {

    protected UtilityImpl() throws RemoteException {
        super();
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public int square(int n) {
        return n * n;
    }
}
