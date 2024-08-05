package Labbook.Assignment1;

public class a1 {
    public static void main(String[] args) {
        int n = 7;
        boolean flag = true;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                flag = false;

        if (flag)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }

}
