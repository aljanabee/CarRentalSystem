import java.rmi.Naming;

public class Client {

        public static void main(String[] args) {
        try {
            ICarService carService = (ICarService) Naming.lookup("rmi://localhost/CarService");
            Car car = carService.getCarDetails("carId123");
            System.out.println("Car details: " + car);
            // Other operations...
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }

}
