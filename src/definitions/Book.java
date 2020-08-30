/*  Created by IntelliJ IDEA.
 *  User: Pratik Sharma (pratik121212)
 *  Date: 26/08/20
 *  Time: 12:00 AM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    // Components of a Definition Class in Java
    // 1. private fields
    // 2. public getters & setters
    // 3. Constructors for initializing the fields.
    // 4. toString() method
    // 5. equals() and hashCode() method


    private String bookName;
    private String bookAuthor;
    private String bookIsbnNumber;

    public Book() {
        this.bookName = "Harry Potter";
        this.bookAuthor = "J.K. Rowling";
        this.bookIsbnNumber = "1000000000000";
    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.bookAuthor = "Rudyard Kypling";
        this.bookIsbnNumber = "6374829009876";
    }

    public Book(String bookName, String bookAuthor, String bookIsbnNumber) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookIsbnNumber = bookIsbnNumber;
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

    public void issueBook() {
        System.out.println("Thank you for issuing.");
    }

    public void doReturn() {
        System.out.println("Thank You for returning.");
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

