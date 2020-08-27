/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private String studentName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;
    private String[] book;

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

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book.clone();
    }

    @Override
    public String toString() {
        return String.format("Student name: %s, Student's University Roll no.: %d, Number of books issued by Student: %d, Books: %s",
                getStudentName(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent(),
                Arrays.toString(book));
    }
}
