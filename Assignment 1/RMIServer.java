import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            Utility service = new UtilityImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("UtilityService", service);
            System.out.println("RMI Server running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
