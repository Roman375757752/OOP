package LibraryBook;

import java.util.ArrayList;
import java.util.List;

public class LibraryBook {
    private String title;
    private String author;
    private String isbn;

    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayInfo() {
        System.out.println("Книга: " + title + " (" + author + "), ISBN: " + isbn);
    }
}

