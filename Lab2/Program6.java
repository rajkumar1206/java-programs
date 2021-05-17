package Lab2;

import java.util.Scanner;
import java.util.StringTokenizer;

class Employee {
    private String employeeId;
    private String name;
    private int salary;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class Program6 {
    public static void main(String[] args) {
        System.out.println("Enter the employee details in format given");
        System.out.println("EmployeeId Name Salary");

        Scanner scn = new Scanner(System.in);
        String txt = scn.nextLine();
        Employee emp = new Employee();

        StringTokenizer tokenTxt = new StringTokenizer(txt, " ");

        emp.setEmployeeId(tokenTxt.nextToken());
        emp.setName(tokenTxt.nextToken());
        emp.setSalary(Integer.parseInt(tokenTxt.nextToken()));

        System.out.println("Employee Details are: ");
        System.out.println("Employee Id: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
