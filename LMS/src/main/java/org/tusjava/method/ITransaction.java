package org.tusjava.method;

public interface ITransaction {
    void checkOutBook(String isbn, String userId);
    void returnBook(String isbn, String userId);
}

