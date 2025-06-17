public class DigitalBook extends Book {
    private double fileSize;

    public DigitalBook(String title, String author, int pages, double fileSize) {
        super(title, author, pages);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public void showInfo() {
        System.out.println("Электронная книга: " + getTitle() + " (автор: " + getAuthor() + "), " + getPages() + " страниц, размер: " + fileSize + " MB");
    }
}