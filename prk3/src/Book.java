public class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void showInfo() {
        System.out.println("Книга: " + getTitle() + " (автор: " + getAuthor() + "), " + pages + " страниц");
    }

}