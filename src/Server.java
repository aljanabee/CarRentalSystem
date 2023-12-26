import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // RMI registry on port 1099
            ICarService carService = new CarServiceImpl();
            Naming.rebind("rmi://localhost/CarService", carService);
            System.out.println("Service started. Ready to accept clients.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
