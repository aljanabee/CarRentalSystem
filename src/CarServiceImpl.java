import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.List;
import java.util.ArrayList;

public class CarServiceImpl extends UnicastRemoteObject implements ICarService {

        private List<Car> cars;

        public CarServiceImpl() throws RemoteException {
                super();
                cars = new ArrayList<>();
                // Initialize some sample cars
                cars.add(new Car("C001", "Model S", "Tesla", 2021, 150.0, "Available"));
                cars.add(new Car("C002", "Corolla", "Toyota", 2019, 80.0, "Available"));
                // More cars can be added here
        }

        @Override
        public Car getCarDetails(String carId) throws RemoteException {
                for (Car car : cars) {
                        if (car.getCarId().equals(carId)) {
                                return car;
                        }
                }
                return null; // Car not found
        }

        @Override
        public List<Car> getAllCars() throws RemoteException {
                return new ArrayList<>(cars); // Return a copy of the car list
        }

        @Override
        public void addCar(Car car) throws RemoteException {
                cars.add(car);
        }

}
