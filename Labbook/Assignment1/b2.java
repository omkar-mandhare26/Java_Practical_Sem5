package Labbook.Assignment1;

import java.util.*;

public class b2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No Elements: ");
        int n = input.nextInt();
        int armStrongArray[] = new int[n];
        int index = -1;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element" + (i + 1) + ": ");
            int data = input.nextInt();

            int temp = data;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem;
                temp /= 10;
            }
            if (data == sum)
                armStrongArray[++index] = data;
        }

        if (index != -1) {
            System.out.println("Armstrong Elements:");
            for (int i = 0; i <= index; i++) {
                System.out.println(armStrongArray[i]);
            }
        } else
            System.out.println("No Armstrong Elements Found");
        input.close();
    }
}
