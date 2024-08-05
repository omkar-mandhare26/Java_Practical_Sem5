package Labbook.Assignment1;

import java.util.Scanner;

public class p2 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int n3 = obj.nextInt();
        obj.close();

        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
