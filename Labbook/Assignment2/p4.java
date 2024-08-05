package Labbook.Assignment2;

class sumOfDigits {
    int sum = 0;

    public int sum(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + sum(n / 10);
    }
}

public class p4 {
    static public void main(String args[]) {
        int n = 536;
        sumOfDigits obj = new sumOfDigits();
        int sum = obj.sum(n);
        System.out.println("Sum of digits: " + sum);
    }
}
