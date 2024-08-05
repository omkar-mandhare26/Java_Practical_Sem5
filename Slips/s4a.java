package Slips;

public class s4a {
    public static void main(String[] args) {
        String str = "Martin Garrix";

        System.out.println("Original String: " + str);

        for (int i = 0; i < str.length(); i += 2)
            System.out.print(str.charAt(i));
    }
}
