package Labbook.Assignment1;

import java.util.*;

public class b1 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No of Cities: ");
        n = input.nextInt();

        String[] cities = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter City Name " + (i + 1) + ": ");
            cities[i] = input.next();
        }
        for (int i = 0; i < n; i++)
            System.out.println("City " + (i + 1) + ": " + cities[i]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cities[j].compareTo(cities[j + 1]) > 0) {
                    String temp = cities[j];
                    cities[j] = cities[j + 1];
                    cities[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sort: \n");
        for (int i = 0; i < n; i++)
            System.out.println("City " + (i + 1) + ": " + cities[i]);

        input.close();
    }
}
