package Labbook.Assignment1;

public class a4 {
    public static void main(String args[]) {
        for (String arg : args) {
            int n = Integer.parseInt(arg);

            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
