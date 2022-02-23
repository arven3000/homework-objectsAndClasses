package pro.sky.java.course1;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object otherBook) {
        if (this == otherBook) return true;
        if (otherBook == null || getClass() != otherBook.getClass()) return false;
        Book book = (Book) otherBook;
        return this.year == book.year && this.name.equals(book.name) && this.author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
