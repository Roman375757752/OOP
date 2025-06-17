public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void showInfo() {
        System.out.println("Журнал: " + getTitle() + " (автор: " + getAuthor() + "), номер выпуска: " + issueNumber);
    }

}