package ru.mirea.lab4.part_2.lab4_2;

public class Book {
    protected String bookName;
    protected String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String newBookName) {
        this.bookName = newBookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    @Override
    public String toString() {
        return bookName + " (" + author + ")";
    }
}
