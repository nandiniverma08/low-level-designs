package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private String publisher;

    private List<BookCopy> copies = new ArrayList<>();

    public Book(String isbn, String title, String author, String publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
}
