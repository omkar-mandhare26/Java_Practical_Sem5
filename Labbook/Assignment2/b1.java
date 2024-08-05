package Labbook.Assignment2;

import java.util.*;

class person {
    private int pid;
    private String pname;
    private int age;
    private String gender;

    person() {
        pid = 0;
        pname = "";
        age = 0;
        gender = "";
    }

    person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Person ID: " + pid);
        System.out.println("Person Name: " + pname);
        System.out.println("Person Age: " + age);
        System.out.println("Person Gender: " + gender + "\n\n");
    }
}

public class b1 {
    public static void main(String[] args) {
        int n = 5;
        Scanner input = new Scanner(System.in);
        int pid;
        int age;
        String pname;
        String gender;

        person[] people = new person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Person" + (i + 1) + "Details: ");
            System.out.print("Enter Person's ID: ");
            pid = input.nextInt();
            input.nextLine();
            System.out.print("Enter Person's Name: ");
            pname = input.nextLine();
            System.out.print("Enter Person's Age: ");
            age = input.nextInt();
            input.nextLine();
            System.out.print("Enter Person's Gender(M or F ONLY): ");
            gender = input.nextLine();
            System.out.println();

            people[i] = new person(pid, pname, age, gender);
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Person" + (i + 1) + ": ");
            people[i].display();
        }

        input.close();
    }
}