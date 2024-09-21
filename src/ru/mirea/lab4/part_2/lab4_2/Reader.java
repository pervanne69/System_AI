package ru.mirea.lab4.part_2.lab4_2;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Reader {
    protected String fullName;
    protected String readerNumberTicket;
    protected String faculty;
    protected LocalDate dateOfBirth;
    protected String phoneNumber;

    public Reader(String fullName, String readerNumberTicket, String faculty, LocalDate dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerNumberTicket = readerNumberTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;

    }

    public void takeBook(int n) {
        System.out.printf("%s взял %d книги\n", fullName, n);
    }

    ;

    public void takeBook(String @NotNull ... booksName) {
        System.out.printf("%s взял книги: ", fullName);
        for (String book : booksName) {
            System.out.print(book + ", ");
        }
        System.out.print("\n");


    }

    public void takeBook(Book @NotNull ... books) {
        System.out.printf("%s взял книги: ", fullName);
        for (Book book : books) {
            System.out.print(book.getBookName() + ", ");
        }
        System.out.print("\n");
    }


    public void returnBook(int n) {
        System.out.printf("%s вернул %d книги\n", fullName, n);
    }

    ;

    public void returnBook(String @NotNull ... booksName) {
        System.out.printf("%s вернул книги: ", fullName);
        for (String book : booksName) {
            System.out.print(book + ", ");
        }
        System.out.print("\n");


    }

    public void returnBook(Book @NotNull ... books) {
        System.out.printf("%s вернул книги: ", fullName);
        for (Book book : books) {
            System.out.print(book.getBookName() + ", ");
        }
        System.out.print("\n");
    }


}
