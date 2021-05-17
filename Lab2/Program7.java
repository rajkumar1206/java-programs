package Lab2;

import java.util.Scanner;

class Student {
    String usn;
    String name;
    String branch;
    String phone;

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class Program7 {
    public static void main(String[] args) {
        System.out.print("Enter the number of Student: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Student[] studentList = new Student[n];
        for (int i = 0; i < n; i++) studentList[i] = new Student();

        System.out.println("Enter the Student Details");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Student "+(i+1)+" Details");
            System.out.print("Enter the usn: ");
            studentList[i].setUsn(scn.next());
            System.out.print("Enter the Name: ");
            studentList[i].setName(scn.next());
            System.out.print("Enter the Branch: ");
            studentList[i].setBranch(scn.next());
            System.out.print("Enter the Phone Number: ");
            studentList[i].setPhone(scn.next());
        }

        System.out.println();
        System.out.println("The Student Details are");
        for (int i = 0; i < n; i++) {
            System.out.println("The Student "+(i+1)+" Details");
            System.out.println("Student Usn: " + studentList[i].getUsn());
            System.out.println("Student Name: " + studentList[i].getName());
            System.out.println("Student Branch: " + studentList[i].getBranch());
            System.out.println("Student Phone Number: " + studentList[i].getPhone());
            System.out.println();
        }
    }
}
