public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String model) {
        return new Car(model);
    }
}
