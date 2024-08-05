package Labbook.Assignment1;

import java.util.Scanner;

public class p3 {

    public static void main(String args[]) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter integer: ");

        int n = scannerObj.nextInt();
        scannerObj.close();

        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++)
            System.out.println(n * i);
    }
}
