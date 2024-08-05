package Labbook.Assignment2;

import java.util.*;

class fibonacciSeries {
    void getFibonacci(int n) {
        int count = 1;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1 + " " + n2 + " ");
        while (count != n) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            count += 1;
        }
    }
}

public class a2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();

        fibonacciSeries fibo = new fibonacciSeries();
        fibo.getFibonacci(n);
    }
}
