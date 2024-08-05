package Labbook.Assignment1;

public class a5 {
    public static void main(String[] args) {
        String str = "ACBCSO";
        String orginalStr = str;
        str = str.toLowerCase();
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < str.length(); j++)
                if (str.charAt(j) == vowels[i])
                    System.out.println(orginalStr.charAt(j));
    }
}