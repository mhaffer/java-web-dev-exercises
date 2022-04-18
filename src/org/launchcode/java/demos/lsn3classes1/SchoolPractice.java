package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student student1 = new Student("Maddison", 1, 1, 4.0);
        System.out.println(student1.getName() + " : " + student1.getStudentId());
        System.out.println(student1.studentInfo(10));

        System.out.println(student1.toString());
//    
    }
}