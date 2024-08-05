package Labbook.Assignment1;

import java.util.*;

public class a3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No of Names: ");
        int n = input.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        System.out.println("Names: \n");
        for (int i = 0; i < n; i++)
            System.out.println(names[i]);

        System.out.println("Reverse Order: \n");
        for (int i = (n - 1); i >= 0; i--)
            System.out.println(names[i]);

        input.close();
    }
}
