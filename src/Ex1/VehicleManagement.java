package Ex1;

public class VehicleManagement {
    private final Car car;
    private final Bicycle bicycle;

    public VehicleManagement(Car car, Bicycle bicycle) {
        this.car = car;
        this.bicycle = bicycle;
    }

    public void runAllVehicles() {
        car.run();
        bicycle.run();
    }

    public void stopAllVehicles() {
        car.stop();
        bicycle.stop();
    }

    public void printAllVehicleTypes() {
        car.printType();
        bicycle.printType();
    }
}
