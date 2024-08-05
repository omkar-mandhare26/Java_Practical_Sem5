package Labbook.Assignment1;

public class c3 {
    public static void main(String[] args) {
        int arr1[] = { 78, 65, 11, 32 };
        int arr2[] = { 65, 32, 12, 44, 32 };

        int n = (arr1.length + arr2.length) - 1;
        int arr3[] = new int[n];
        for (int i = 0; i < arr1.length; i++)
            arr3[i] = arr1[i];

        for (int i = 0; i < arr2.length; i++)
            arr3[((arr1.length - 1) + i)] = arr2[i];

        System.out.println("Union Array: ");
        for (int i = 0; i < n; i++)
            System.out.println(arr3[i]);
    }
}
