package Pet;

public class PetTest {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Барсик", 5, "Кот");

        pet1.displayInfo();

        System.out.println("Увеличим возраст на 1");
        pet1.increaseAge();
        pet1.displayInfo();

        System.out.println("Это старый питомец? " + (pet1.isOld() ? "Да" : "Нет"));

        System.out.println("Уменьшим возраст на 1");
        pet1.decreaseAge();
        pet1.displayInfo();

        System.out.println("Уменьшим возраст ещё раз, пока не станет 0");
        pet1.changeAge(0);
        pet1.decreaseAge();  // Проверка, что возраст не уходит в минус
        pet1.displayInfo();

        System.out.println("Обновим возраст до 12");
        pet1.changeAge(12);
        pet1.displayInfo();
        System.out.println("Это старый питомец? " + (pet1.isOld() ? "Да" : "Нет"));

        System.out.println("Текущий вид: " + pet1.getSpecies());
        System.out.println("Обновим вид на 'Тигр'");
        pet1.updateSpecies("Тигр");
        pet1.displayInfo();

        System.out.println("Вывод через toString(): " + pet1.toString());
    }
}
