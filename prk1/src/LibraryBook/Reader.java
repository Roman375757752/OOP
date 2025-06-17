package LibraryBook;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<LibraryBook> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void addBook(LibraryBook book) {
        borrowedBooks.add(book);
    }

    public void displayInfo() {
        System.out.println("Читатель: " + name + ", количество книг: " + borrowedBooks.size());
    }

    public int getBooksCount() {
        return borrowedBooks.size();
    }

    public boolean hasBook(LibraryBook book) {
        return borrowedBooks.contains(book);
    }

    public void removeBook(LibraryBook book) {
        borrowedBooks.remove(book);
    }

    public String toString() {
        return name + " (книг: " + borrowedBooks.size() + ")";
    }
}
