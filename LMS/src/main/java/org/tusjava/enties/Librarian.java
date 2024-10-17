package org.tusjava.enties;

import org.tusjava.services.LibraryService;
import org.tusjava.services.MembershipService;
import org.tusjava.utilities.BookStatus;

public class Librarian {
    private String name;
    private LibraryService libraryService;
    private MembershipService membershipService;

    // Constructor
    public Librarian(String name, LibraryService libraryService, MembershipService membershipService) {
        this.name = name;
        this.libraryService = libraryService;
        this.membershipService = membershipService;
    }

    // Method to add a new book to the library
    public void addBook(String title, String author, String isbn, String publicationDate) {
        Book newBook = new Book(title, author, isbn, BookStatus.AVAILABLE);
        boolean success = libraryService.addBook(newBook);
        if (success) {
            System.out.println("Book added successfully: " + newBook);
        } else {
            System.out.println("Failed to add book.");
        }
    }

    // Method to update the status of a book
    public void updateBookStatus(String isbn, BookStatus newStatus) {
        boolean success = libraryService.updateBookStatus(isbn, newStatus);
        if (success) {
            System.out.println("Book status updated successfully for ISBN " + isbn);
        } else {
            System.out.println("Failed to update book status.");
        }
    }

    // Method to add a new member to the library
    public void addMember(String name, String address, String email, String phone) {
        Member newMember = new Member(name, address, email, phone);
        boolean success = membershipService.addMember(newMember);
        if (success) {
            System.out.println("Member added successfully: " + newMember);
        } else {
            System.out.println("Failed to add member.");
        }
    }

    // Method to renew a member's subscription
    public void renewMembership(int memberId) {
        boolean success = membershipService.renewMembership(memberId);
        if (success) {
            System.out.println("Membership renewed for member ID: " + memberId);
        } else {
            System.out.println("Failed to renew membership.");
        }
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
