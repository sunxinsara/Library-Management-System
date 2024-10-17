package org.tusjava.services;

import org.tusjava.enties.Book;
import org.tusjava.utilities.BookStatus;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    private Map<String, Book> books;  // A simple in-memory database substitute

    public LibraryService() {
        this.books = new HashMap<>();
    }

    // Adds a book to the library
    public boolean addBook(Book book) {
        if (book != null && !books.containsKey(book.getIsbn())) {
            books.put(book.getIsbn(), book);
            return true;
        }
        return false;
    }

    // Updates the status of a book
    public boolean updateBookStatus(String isbn, BookStatus newStatus) {
        Book book = books.get(isbn);
        if (book != null) {
            book.setStatus(newStatus);
            return true;
        }
        return false;
    }

    // Retrieves a book by ISBN
    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    // Other methods such as removeBook, listAllBooks, etc., can be added here
}
