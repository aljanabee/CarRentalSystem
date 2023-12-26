import java.io.Serializable;

public class Car implements Serializable {
    private String carId;
    private String model;
    private String make;
    private int year;
    private double pricePerDay;
    private String status; // e.g., "Available", "Booked"

    public Car(String carId, String model, String make, int year, double pricePerDay, String status) {
        this.carId = carId;
        this.model = model;
        this.make = make;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }

    // Getters
    public String getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setCarId(String carId) {
        this.carId = carId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", pricePerDay=" + pricePerDay +
                ", status='" + status + '\'' +
                '}';
    }
}
