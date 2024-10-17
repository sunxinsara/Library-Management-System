package org.tusjava.method;

import org.tusjava.enties.Book;

public interface IResourceManagement {
    void addResource(Book book);
    Book getResource(String isbn);
    void updateResource(Book book);
    void deleteResource(String isbn);
}