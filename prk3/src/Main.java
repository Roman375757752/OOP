public class Main {
    public static void main(String[] args) {
        // Создаем элементы библиотеки
        Book book1 = new Book("Война и мир", "Лев Толстой", 1225);
        Magazine magazine1 = new Magazine("National Geographic", "Various", 256);
        DigitalBook digitalBook1 = new DigitalBook("Clean Code", "Robert Martin", 464, 2.5);

        // Создаем обычную библиотеку
        Library<LibraryItem> library = new Library<>();
        library.addItem(book1);
        library.addItem(magazine1);
        library.addItem(digitalBook1);
        library.showAllItems();

        // Создаем библиотеку с возможностью аренды (только для книг)
        BorrowableLibrary<Book> borrowableLibrary = new BorrowableLibrary<>();
        borrowableLibrary.addItem(book1);
        borrowableLibrary.addItem(new Book("1984", "Джордж Оруэлл", 328));

        // Работаем с арендой
        borrowableLibrary.showAllItems();
        borrowableLibrary.borrowItem(book1);
        borrowableLibrary.showAllItems();
        borrowableLibrary.returnItem(book1);
        borrowableLibrary.showAllItems();
    }
}