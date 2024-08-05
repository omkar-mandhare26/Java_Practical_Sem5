package Labbook.Assignment2;

class factorial {
    int getFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * getFactorial(n - 1);
    }
}

public class a5 {
    public static void main(String[] args) {
        int n = 5;

        factorial f = new factorial();
        int result = f.getFactorial(n);

        System.out.println(result);
    }
}
