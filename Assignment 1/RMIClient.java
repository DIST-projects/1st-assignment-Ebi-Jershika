import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Utility service = (Utility) registry.lookup("UtilityService");

            System.out.println("Reverse String: " + service.reverseString("Distributed"));
            System.out.println("Max in Array: " + service.findMax(new int[]{3, 9, 5, 2}));
            System.out.println("Square: " + service.square(6));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
