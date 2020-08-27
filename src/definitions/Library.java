/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    // Components of Library Class
    // 1. private fields
    // 2. public getters and setters
    // 3. Constructors for initializing the fields
    // 4. toString() method
    // 5. equals() and hashCode() method

    private String[] book;

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return String.format("Books in Library: %s", Arrays.toString(book));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBook(), library.getBook());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBook());
    }
}
