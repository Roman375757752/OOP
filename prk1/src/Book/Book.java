package Book;

public class Book {
    private String title;
    private String author;
    private int pages;
    private String genre;

    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public void displayInfo() {
        System.out.println("Книга: " + title + " (" + author + "), жанр: " + genre + ", страниц: " + pages);
    }

    public boolean isLong() {
        return pages > 300;
    }

    public void changeGenre(String newGenre) {
        this.genre = newGenre;
    }

    public void addPages(int count) {
        pages += count;
    }

    public void updateAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public boolean isShort() {
        return pages < 100;
    }

    public String toString() {
        return title + " от " + author + " (" + genre + ")";
    }
}
