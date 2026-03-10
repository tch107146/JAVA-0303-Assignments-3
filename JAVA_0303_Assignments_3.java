import java.util.Scanner;

/**
 * Assignment 3: Matrix Multiplication and Numerical Differentiation
 * 實作內容：
 * 3-1. 矩陣乘法運算
 * 3-2. 有限差分法計算導數 (f(x) = x^2)
 */

class MatrixMath {
    // 矩陣乘法實作: C = A * B
    public double[][] multiply(double[][] A, double[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        double[][] C = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public void printMatrix(double[][] matrix, String name) {
        System.out.println("Matrix " + name + ":");
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
}

class CalculusMath {
    // 定義函數 f(x) = x^2
    public double f(double x) {
        return x * x;
    }

    // 使用中心差分法計算導數: f'(x) ~ (f(x+h) - f(x-h)) / 2h
    public double computeDerivative(double x, double h) {
        return (f(x + h) - f(x - h)) / (2 * h);
    }
}

public class JAVA_0303_Assignments_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // --- 3-1. Matrix Multiplication ---
        System.out.println("=== 3-1. Matrix Multiplication ===");
        MatrixMath mm = new MatrixMath();
        double[][] A = {{1, 2}, {3, 4}};
        double[][] B = {{5, 6}, {7, 8}};
        
        double[][] C = mm.multiply(A, B);
        mm.printMatrix(A, "A");
        mm.printMatrix(B, "B");
        mm.printMatrix(C, "C (Result)");

        // --- 3-2. Finite Difference Derivative ---
        System.out.println("\n=== 3-2. Finite Difference Derivative ===");
        CalculusMath cm = new CalculusMath();
        
        System.out.print("Enter point x to calculate derivative of f(x)=x^2: ");
        double x = scanner.nextDouble();
        System.out.print("Enter a small interval h (e.g., 0.0001): ");
        double h = scanner.nextDouble();
        
        double approxDeriv = cm.computeDerivative(x, h);
        double exactDeriv = 2 * x; // f'(x) = 2x
        
        System.out.printf("Calculated Derivative: %.10f%n", approxDeriv);
        System.out.printf("Exact Derivative (2x): %.10f%n", exactDeriv);
        System.out.printf("Error: %.10e%n", Math.abs(approxDeriv - exactDeriv));

        System.out.println("\nSimulation completed. Please capture screenshots.");
        scanner.close();
    }
}