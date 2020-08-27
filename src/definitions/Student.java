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
    private String studentName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] booksIssued;

    public Student(String studentName, long studentUniversityRollNumber, int numberOfBooksIssuedByStudent) {
        this.studentName = studentName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.booksIssued = new Book[numberOfBooksIssuedByStudent];
        for (int i = 0; i < booksIssued.length; i++) {
            booksIssued[i] = new Book("Book " + (i + 5), "Book Author " + (i + 5), Long.toString(10000000001231L + i));
        }

    }

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

    public Book[] getBooksIssued() {
        return booksIssued.clone();
    }

    public void setBooksIssued(Book[] books) {
        this.booksIssued = books;
    }

    @Override
    public String toString() {
        return String.format("Student name: %s, Student's University Roll no.: %d, Number of books issued by Student: %d, Books: %s",
                getStudentName(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent(),
                Arrays.toString(booksIssued));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNumber() == student.getStudentUniversityRollNumber() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                getStudentName().equals(student.getStudentName()) &&
                Arrays.equals(getBooksIssued(), student.getBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getBooksIssued());
        return result;
    }

    public void issueBook(String name) {
        System.out.println("\"" + name + "\" is now issued.");
    }

    public void doReturn(String name) {
        System.out.println("Thank you for returning \"" + name + "\".");
    }

    public void showAllBooks() {
        for (Book book : this.booksIssued) {
            System.out.println(book);
        }
    }
}
