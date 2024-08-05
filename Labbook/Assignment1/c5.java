package Labbook.Assignment1;

public class c5 {
    public static void main(String[] args) {
        String str = "This is a String!?";
        System.out.println("Original String: " + str);

        System.out.println("Alternate Chars");
        for (int i = 0; i < str.length(); i += 2)
            System.out.print(str.charAt(i));
    }
}