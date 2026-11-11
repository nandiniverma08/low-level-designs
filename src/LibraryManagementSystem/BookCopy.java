package LibraryManagementSystem;

public class BookCopy {

    private String copyId;
    private Book book;
    private BookStatus status;

    public BookCopy(String copyId, Book book) {
        this.copyId = copyId;
        this.book = book;
        this.status = BookStatus.AVAILABLE;
    }
}
