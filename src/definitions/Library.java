/*  Created by IntelliJ IDEA.
 *  User: Pratik Sharma (pratik1212122)
 *  Date: 30/08/20
 *  Time: 5:53 PM
 *  File Name : Library.java
 * */

package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Library {


    private Book[] books;
    private Book[] booksIssued;
    private int numberOfBooksIssuedByStudent;

    public Book[] getBooks() {
        return books.clone();
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Library(int numberOfBooksIssuedByStudent) {
        this.books = new Book[50];
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("Book " + (i + 1), "Book Author " + (i + 1), Long.toString(1000000000000L + i));
        }
        this.booksIssued = new Book[numberOfBooksIssuedByStudent];
        // { null, null, ..... }
        // since every element is a Book object
        // { new Book(), new Book(), ........ }

        for (int i = 0; i < booksIssued.length; i++) {
            booksIssued[i] = new Book("Book " + (i + 7), "Generic Author " + (i + 11), Long.toString(3200006000000L + (i + 12)));
        }

    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getBooksIssued() {
        return booksIssued.clone();
    }

    public void setBooksIssued(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }
    // These 'special' methods are already discussed before.

    @Override
    public String toString() {
        return String.format("Books in Library: %s \nBooks issued by student: %s", Arrays.toString(books), Arrays.toString(booksIssued));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return getNumberOfBooksIssuedByStudent() == library.getNumberOfBooksIssuedByStudent() &&
                Arrays.equals(getBooks(), library.getBooks()) &&
                Arrays.equals(getBooksIssued(), library.getBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getBooks());
        result = 31 * result + Arrays.hashCode(getBooksIssued());
        return result;
    }

    /**
     * This method will allow the student to issue the book.
     *
     * @param name The name of the book which the student wants to issue.
     */
    public void doIssueBook(String name) {
        System.out.println("\"" + name + "\" is now issued.");
    }

    /**
     * This method will allow the student to return a previously issued  book.
     *
     * @param name The name of the book which the student wants to return.
     */
    public void doReturn(String name) {
        System.out.println("Thank you for returning \"" + name + "\".");
    }

    /**
     * This method will allow the student to show all his/her issued books.
     */

    public void showAllBooks() {
        for (Book book : this.booksIssued) {
            System.out.println(book);
        }
    }
}
