package Labbook.Assignment2;

import java.util.*;

class Student {
    public int rno;
    public String name;
    public int mark1;
    public int mark2;

    class Result {
        public int total;
        public double percenteage;

        public void calculateResult(Student obj) {
            total = obj.mark1 + obj.mark2;
            percenteage = ((double) total / 200) * 100;
        }

        public void displayResult() {
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percenteage + "%");
        }
    }

    void getStudentDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student's Roll No: ");
        this.rno = input.nextInt();
        System.out.print("Enter Student's Name: ");
        this.name = input.next();
        System.out.print("Enter Student's Mark1 & Mark2: ");
        this.mark1 = input.nextInt();
        this.mark2 = input.nextInt();

        input.close();
    }

    void display() {
        Result obj = new Result();
        obj.calculateResult(this);

        System.out.println("Roll no: " + rno);
        System.out.println("Student Name: " + name);
        System.out.println("Mark1: " + mark1 + " & Mark2: " + mark2);
        obj.displayResult();
    }

}

public class c1 {
    static public void main(String args[]) {
        Student obj = new Student();
        obj.getStudentDetails();
        obj.display();
    }
}
