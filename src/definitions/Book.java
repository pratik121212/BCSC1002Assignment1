/*  Created by IntelliJ IDEA.
 *  User: Pratik Sharma (pratik121212)
 *  Date: 26/08/20
 *  Time: 12:00 AM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {


    private String bookName;
    private String bookAuthor;
    private String bookIsbnNumber;

    public Book() {
        this.bookName = "Harry Potter";
        this.bookAuthor = "J.K. Rowling";
        this.bookIsbnNumber = "8646314629841";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }

    @Override
    public String toString() {
        return String.format("Book name: %s, Book Author: %s, ISBN number of Book: %s",
                getBookName(), getBookAuthor(), getBookIsbnNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getBookAuthor(), book.getBookAuthor()) &&
                Objects.equals(getBookIsbnNumber(), book.getBookIsbnNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthor(), getBookIsbnNumber());
    }
}

