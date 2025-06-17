package Book;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "Джордж Оруэлл", 328, "Антиутопия");

        book1.displayInfo();

        System.out.println("Это длинная книга? " + (book1.isLong() ? "Да" : "Нет"));

        System.out.println("Это короткая книга? " + (book1.isShort() ? "Да" : "Нет"));

        book1.addPages(50);
        System.out.print("После добавления страниц: ");
        book1.displayInfo();

        book1.changeGenre("Политическая сатира");
        System.out.print("После смены жанра: ");
        book1.displayInfo();

        book1.updateAuthor("George Orwell");
        System.out.print("После обновления автора: ");
        book1.displayInfo();

        System.out.println("Информация через toString(): " + book1.toString());

        Book book2 = new Book("Скотный двор", "Джордж Оруэлл", 95, "Сатира");
        System.out.println("\nТест для короткой книги:");
        book2.displayInfo();
        System.out.println("Это длинная книга? " + (book2.isLong() ? "Да" : "Нет"));
        System.out.println("Это короткая книга? " + (book2.isShort() ? "Да" : "Нет"));
    }
}
