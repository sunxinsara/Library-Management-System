package org.tusjava.method;

import org.tusjava.enties.Book;

import java.util.HashMap;
import java.util.Map;

public class LibraryResourceManagement implements IResourceManagement {
    private Map<String, Book> books = new HashMap<>();

    @Override
    public void addResource(Book book) {
        books.put(book.getIsbn(), book);
    }

    @Override
    public Book getResource(String isbn) {
        return books.get(isbn);
    }

    @Override
    public void updateResource(Book book) {
        books.put(book.getIsbn(), book);
    }

    @Override
    public void deleteResource(String isbn) {
        books.remove(isbn);
    }
}
