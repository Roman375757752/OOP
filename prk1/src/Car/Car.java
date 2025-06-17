package Car;

public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;

    public Car(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void displayInfo() {
        System.out.println("Автомобиль: " + make + " " + model + ", год выпуска: " + year + ", пробег: " + mileage + " км");
    }

    public void increaseMileage(int amount) {
        mileage += amount;
    }

    public boolean isOld() {
        return year < 2000;
    }

    public void updateModel(String newModel) {
        this.model = newModel;
    }

    public boolean isHighMileage() {
        return mileage > 100000;
    }

    public void updateMakeAndModel(String newMake, String newModel) {
        this.make = newMake;
        this.model = newModel;
    }

    public int getYear() {
        return year;
    }
}

