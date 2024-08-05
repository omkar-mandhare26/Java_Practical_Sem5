package Labbook.Assignment2;

import java.util.*;

class Employees {
    public int empId;
    public int salary;
    public String name;

    Employees() {
        empId = 0;
        name = "";
        salary = 0;
    }

    public void getEmp() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        this.empId = input.nextInt();
        input.nextLine();
        System.out.print("Enter Employee Name: ");
        this.name = input.nextLine();
        System.out.print("Enter Employee Salary: ");
        this.salary = input.nextInt();
        System.out.print("\n");

        input.close();
    }

    public void displayEmp() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class c2 {
    public static void main(String args[]) {
        Employees emps[] = new Employees[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No of Employees: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            emps[i] = new Employees();
            emps[i].getEmp();
        }

        System.out.println("Employees: ");
        for (int i = 0; i < n; i++) {
            emps[i].displayEmp();
        }

        // Sorting by Salary
        for (int i = 0; i < n - 1; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++) {
                if (emps[k].salary > emps[j].salary) {
                    k = j;
                }
            }
            if (k != i) {
                Employees temp = emps[i];
                emps[i] = emps[k];
                emps[k] = temp;
            }
        }
        // After Sort
        System.out.println("Employees: ");
        for (int i = 0; i < n; i++) {
            emps[i].displayEmp();
        }

        input.close();
    }
}
