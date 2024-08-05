package Labbook.Assignment1;

public class b3 {
    public static void main(String[] args) {
        String[] names = { "Omkar", "Martin", "Tim", "Avicii", "Vedant" };
        String findName = "avicii";
        int i;
        for (i = 0; i < names.length; i++)
            if (names[i] == findName) {
                System.out.println("Index: " + i);
                break;
            }

        if (i == names.length)
            System.out.println("Name not found");
    }
}
