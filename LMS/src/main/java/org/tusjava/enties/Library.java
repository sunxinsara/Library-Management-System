package org.tusjava.enties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.tusjava.enties.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * Represents the library, managing a collection of books.
 */
@Getter
@Setter
@NoArgsConstructor
public class Library {
    private List<Book> books = new ArrayList<>();

    /**
     * Adds a book to the library.
     *
     * @param book The book to add.
     */
    public void addBook(Book book) {
        this.books.add(book);
    }

    /**
     * Removes a book from the library.
     *
     * @param isbn The ISBN of the book to remove.
     * @return true if the book was removed, false otherwise.
     */
    public boolean removeBook(String isbn) {
        return books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    /**
     * Finds a book by ISBN.
     *
     * @param isbn The ISBN of the book to find.
     * @return An Optional containing the book if found, or an empty Optional otherwise.
     */
    public Optional<Book> findBookByIsbn(String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst();
    }

    /**
     * Lists all books in the library.
     *
     * @return A list of all books.
     */
    public List<Book> listBooks() {
        return new ArrayList<>(books);
    }

}
