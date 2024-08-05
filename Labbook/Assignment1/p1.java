package Labbook.Assignment1;

public class p1 {
    public static void main(String args[]) {
        String str = "Test";
        System.out.println("Original String " + str);
        int L = 0;
        int R = str.length() - 1;
        boolean flag = true;
        while (L <= R) {
            if (str.charAt(L) != str.charAt(R)) {
                flag = false;
                break;
            }
            L++;
            R--;
        }
        if (flag) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}
