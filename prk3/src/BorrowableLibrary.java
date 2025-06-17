import java.util.HashMap;
import java.util.Map;

public class BorrowableLibrary<T extends LibraryItem> extends Library<T> {
    private final Map<T, Boolean> borrowedItems = new HashMap<>(); //типо словарь, хранит пары

    @Override
    public void showAllItems() {
        System.out.println("\nВсе элементы библиотеки (со статусом аренды):");
        for (T item : items) {
            item.showInfo();
            String status = borrowedItems.getOrDefault(item, false) ? "Взято" : "Доступно"; //сть в словаре - правл, нет- ложь
            System.out.println("  Статус: " + status);
        }
    }

    public void borrowItem(T item) { //взять в арендку
        if (items.contains(item)) { //проверка на есть ли в библиотеке
            borrowedItems.put(item, true); //меняем на правду
            System.out.println("Элемент '" + item.getTitle() + "' взят в аренду");
        } else {
            System.out.println("Элемент '" + item.getTitle() + "' не найден в библиотеке");
        }
    }

    public void returnItem(T item) {
        if (items.contains(item)) {
            borrowedItems.put(item, false);
            System.out.println("Элемент '" + item.getTitle() + "' возвращен");
        } else {
            System.out.println("Элемент '" + item.getTitle() + "' не принадлежит этой библиотеке");
        }
    }
}