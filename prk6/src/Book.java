public class Book extends AbstractProduct {
    private final String author;

    public Book(String id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Книга. Автор: " + author;
    }
}
