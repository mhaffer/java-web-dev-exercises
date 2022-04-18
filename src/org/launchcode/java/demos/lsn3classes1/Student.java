package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.


import java.util.Objects;

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo(int num) {
        return (this.name + " has a GPA of: " + this.gpa * num);
    }

    public static int getNextStudentId() {
        return nextStudentId;
    }

    public static void setNextStudentId(int nextStudentId) {
        Student.nextStudentId = nextStudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + "'" +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() != getClass()) return false;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        return /*getStudentId() == student.getStudentId() &&*/
                getNumberOfCredits() == student.getNumberOfCredits() &&
                        Double.compare(student.getGpa(), getGpa()) == 0 &&
                        getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudentId(), getNumberOfCredits(), getGpa());
    }
}