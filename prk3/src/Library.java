import java.util.ArrayList;
import java.util.List;

public class Library<T extends LibraryItem> { //может работать с ЛЮБЫМИ доч. классами LI
    protected List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void showAllItems() {
        System.out.println("\nВсе элементы библиотеки:");
        for (T item : items) {
            item.showInfo();
        }
    }
}