package org.tusjava.app;

import org.tusjava.enties.Book;
import org.tusjava.enties.Member;
import org.tusjava.services.LibraryService;
import org.tusjava.services.MembershipService;
import org.tusjava.utilities.BookStatus;

import java.util.Scanner;

public class LibraryConsole {
    private static LibraryService libraryService = new LibraryService();
    private static MembershipService membershipService = new MembershipService();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Add Member");
            System.out.println("4. Display Members");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    addMember(scanner);
                    break;
                case 4:
                    displayMembers();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        Book book = new Book(title, author, isbn, BookStatus.AVAILABLE);
        libraryService.addBook(book);
        System.out.println("Book added successfully!");
    }

    private static void displayBooks() {
        libraryService.displayAllBooks();
    }

    private static void addMember(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        // Member member = new Member(name, email);
        // membershipService.addMember(member);
        System.out.println("Member added successfully!");
    }

    private static void displayMembers() {
        membershipService.listAllMembers();
    }
}
