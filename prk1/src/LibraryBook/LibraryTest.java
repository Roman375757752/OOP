package LibraryBook;

public class LibraryTest {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Преступление и наказание", "Ф. М. Достоевский", "978-5-389-07408-5");
        LibraryBook book2 = new LibraryBook("Мастер и Маргарита", "М. А. Булгаков", "978-5-389-07409-2");
        LibraryBook book3 = new LibraryBook("1984", "Джордж Оруэлл", "978-0-452-28423-4");

        Reader reader1 = new Reader("Алексей");

        System.out.println("Информация о читателе:");
        reader1.displayInfo();

        System.out.println("\nДобавим две книги:");
        reader1.addBook(book1);
        reader1.addBook(book2);
        reader1.displayInfo();

        System.out.println("Читатель взял '1984'? " + (reader1.hasBook(book3) ? "Да" : "Нет"));
        System.out.println("Читатель взял 'Мастер и Маргарита'? " + (reader1.hasBook(book2) ? "Да" : "Нет"));

        System.out.println("\nУдалим книгу 'Мастер и Маргарита'");
        reader1.removeBook(book2);
        reader1.displayInfo();

        System.out.println("\nИнформация о книге:");
        book1.displayInfo();

        System.out.println("\nВывод через toString():");
        System.out.println(reader1.toString());
    }
}
