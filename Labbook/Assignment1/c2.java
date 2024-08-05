package Labbook.Assignment1;

public class c2 {
    public static void main(String[] args) {
        String arr[] = { "Avicii", "Martin", "Omkar" };
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i].length() - 1;
            for (int j = n; j >= 0; j--)
                System.out.print(arr[i].charAt(j));

            System.out.println();
        }
    }
}
