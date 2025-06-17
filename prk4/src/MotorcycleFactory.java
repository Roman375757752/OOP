public class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String model) {
        return new Motorcycle(model);
    }
}
