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
    // 2. public getters and setters
    // 3. Constructors for initializing the fields
    // 4. toString() method
    // 5. equals() and hashCode() method

    private String bookName;
    private String bookAuthor;
    private String bookIsbnNumber;

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
        return "Book{" +
                "Book Name ='" + bookName + '\'' +
                ", Book Author ='" + bookAuthor + '\'' +
                ", Book ISBN Number ='" + bookIsbnNumber + '\'' +
                '}';
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

