/*  Created by IntelliJ IDEA.
 *  User: Pratik Sharma (pratik121212)
 *  Date: 30/08/20
 *  Time: 5:22 PM
 *  File Name : Student.java
 * */

package definitions;

import java.util.Objects;

public class Student {
    private String studentName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;


    public Student(String studentName, long studentUniversityRollNumber, int numberOfBooksIssuedByStudent) {
        this.studentName = studentName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;

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


    @Override
    public String toString() {
        return String.format("Student name: %s, Student's University Roll number: %d, Number of books issued: %d",
                getStudentName(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNumber() == student.getStudentUniversityRollNumber() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                getStudentName().equals(student.getStudentName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentName(), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent());
    }
}
