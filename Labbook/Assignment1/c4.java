package Labbook.Assignment1;

public class c4 {
    public static void main(String[] args) {
        int matrix[][] = {
                { 73, 81, 95 },
                { 45, 32, 18 },
                { 7, 7, 7 } };

        int m = matrix.length;
        int n = matrix[0].length;

        int transposeMatrix[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                transposeMatrix[j][i] = matrix[i][j];

        System.out.println("Original Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }

        System.out.println("\nTransposed Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(transposeMatrix[i][j] + "\t");
            System.out.println();
        }

    }
}
