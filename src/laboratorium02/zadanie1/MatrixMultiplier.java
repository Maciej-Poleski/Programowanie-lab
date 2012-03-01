package laboratorium02.zadanie1;

import java.util.Scanner;

public class MatrixMultiplier {
    private double[][] matrix1;
    private double[][] matrix2;

    public double[][] multiplied() {
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; ++i)
            for (int j = 0; j < result[0].length; ++j)
                for (int k = 0; k < matrix2.length; ++k)
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
        return result;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String numbers[] = inputScanner.nextLine().split("\\s+");
        MatrixMultiplier matrixMultiplier = new MatrixMultiplier();
        int n = numbers.length;
        matrixMultiplier.matrix1 = new double[n][n];
        matrixMultiplier.matrix2 = new double[n][n];
        for (int i = 0; i < n; ++i)
            matrixMultiplier.matrix1[0][i] = Double.parseDouble(numbers[i]);
        for (int i = 1; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrixMultiplier.matrix1[i][j] = inputScanner.nextDouble();
            }
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                matrixMultiplier.matrix2[i][j] = inputScanner.nextDouble();
            }
        double[][] result = matrixMultiplier.multiplied();
        for (double[] aResult : result) {
            for (double anAResult : aResult) System.out.print("" + anAResult + " ");
            System.out.println();
        }
    }

}
