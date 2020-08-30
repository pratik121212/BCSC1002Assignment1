/*  Created by IntelliJ IDEA.
 *  User: Pratik Sharma (pratik1212122)
 *  Date: 30/08/20
 *  Time: 5:53 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {


    private Book[] books;

    public Book[] getBooks() {
        return books.clone();
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Library() {
        this.books = new Book[50];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("Book " + (i + 1), "Book Author " + (i + 1), Long.toString(1000000000000L + i));
        }

    }
    // These 'special' methods are already discussed before.

    @Override
    public String toString() {
        return String.format("Books in Library: %s", Arrays.toString(books));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooks(), library.getBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooks());
    }
}
