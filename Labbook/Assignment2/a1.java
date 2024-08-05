package Labbook.Assignment2;

class powerResursion {
    public int power(int x, int y) {
        if (y == 1)
            return x;
        else
            return x * power(x, y - 1);
    }
}

public class a1 {
    static public void main(String args[]) {
        int x = 4;
        int y = 3;
        powerResursion obj = new powerResursion();
        int sum = obj.power(x, y);
        System.out.println(sum);
    }
}
