import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ICarService extends Remote {
    Car getCarDetails(String carId) throws RemoteException;
    List<Car> getAllCars() throws RemoteException;
    void addCar(Car car) throws RemoteException;

}
