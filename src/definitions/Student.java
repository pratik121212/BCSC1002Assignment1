/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    // Components of Student Class
    // 1. private fields
    // 2. public getters and setters
    // 3. Constructors for initializing the fields
    // 4. toString() method
    // 5. equals() and hashCode() method

    private String studentName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] books;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getBooks() {
        return books.clone();
    }

    public void setBooks(String[] book) {
        this.books = books.clone();
    }

    @Override
    public String toString() {
        return String.format("Student name: %s, Student's University Roll no.: %d, Number of books issued by Student: %d, Books: %s",
                getStudentName(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent(),
                Arrays.toString(books));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNumber() == student.getStudentUniversityRollNumber() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                getStudentName().equals(student.getStudentName()) &&
                Arrays.equals(getBooks(), student.getBooks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getBooks());
        return result;
    }
}
