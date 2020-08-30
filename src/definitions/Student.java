/*  Created by IntelliJ IDEA.
 *  User: Pratik Sharma (pratik121212)
 *  Date: 30/08/20
 *  Time: 5:22 PM
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
        // { null, null, ..... }
        // since every element is a Book object
        // { new Book(), new Book(), ........ }

        for (int i = 0; i < booksIssued.length; i++) {
            booksIssued[i] = new Book("Book " + (i + 7), "Generic Author " + (i + 11), Long.toString(3200006000000L + (i + 12)));
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

    public void setBooksIssued(Book[] booksIssued) {
        this.booksIssued = booksIssued;
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

    /**
     * This method will allow the student to issue the book.
     *
     *  @param name The name of the book which the student wants to issue.
     */
    public void issueBook(String name) {
        System.out.println("\"" + name + "\" is now issued.");
    }

    /**
     * This method will allow the student to return a previously issued  book.
     *
     *  @param name The name of the book which the student wants to return.
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
