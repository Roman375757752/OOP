public class SingletonTest {
    public static void main(String[] args) {
        VehicleRegistry registry1 = VehicleRegistry.getInstance();
        VehicleRegistry registry2 = VehicleRegistry.getInstance();

        System.out.println("registry1 == registry2: " + (registry1 == registry2));
        System.out.println("registry1.hashCode(): " + registry1.hashCode());
        System.out.println("registry2.hashCode(): " + registry2.hashCode());
    }
}