package org.tusjava.enties;


import org.tusjava.utilities.BookStatus;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private BookStatus status;  // Possible values: "Available", "Checked Out", "Under Repair", etc.


    public Book(){

    }

    /**
     * Constructor with parameters to initialize the book object.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param isbn The ISBN of the book.
     * @param status The current status of the book.
     */
    public Book(String title, String author, String isbn, BookStatus status) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }

    // Getters and setters for the properties
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    /**
     * Returns a string representation of the book.
     *
     * @return A string describing the book details.
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
