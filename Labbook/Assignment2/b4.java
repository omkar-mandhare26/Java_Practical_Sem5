package Labbook.Assignment2;

class MyNumber {
    private int n;

    MyNumber() {
        n = 0;
    }

    MyNumber(int n) {
        this.n = n;
    }

    public boolean isPositive() {
        return n >= 0;
    }

    public boolean isNegative() {
        return n < 0;
    }
}

public class b4 {
    static public void main(String args[]) {
        MyNumber obj = new MyNumber(Integer.parseInt(args[0]));
        if (obj.isPositive())
            System.out.println("Number is Positive");

        if (obj.isNegative())
            System.out.println("Number is Negative");
    }
}
