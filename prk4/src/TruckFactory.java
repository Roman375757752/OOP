public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String model) {
        return new Truck(model);
    }
}
