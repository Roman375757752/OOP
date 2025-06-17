package Pet;

public class Pet {
    private String name;
    private int age;
    private String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void changeAge(int newAge) {
        this.age = newAge;
    }

    public void displayInfo() {
        System.out.println("Питомец: " + name + ", вид: " + species + ", возраст: " + age + " лет");
    }

    public void increaseAge() {
        age++;
    }

    public void decreaseAge() {
        age = Math.max(0, age - 1);
    }

    public boolean isOld() {
        return age > 10;
    }

    public String getSpecies() {
        return species;
    }

    public void updateSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    public String toString() {
        return name + " (" + species + ", " + age + " лет)";
    }
}