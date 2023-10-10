import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        /*
        C5 = 0 -> "С=a*B , a-const" (a = 2)
        C7 = 4 -> "long"
        C11 =0 -> "Обчислити суму найменших елементів кожного стовпця матриці"
         */

        Scanner scanner = new Scanner(System.in);

        // Введення матриці B та константи a
        System.out.print("Введіть кількість рядків матриці B: ");
        int numRowsB = scanner.nextInt();
        System.out.print("Введіть кількість стовпців матриці B: ");
        int numColsB = scanner.nextInt();
        long[][] matrixB = new long[numRowsB][numColsB];

        System.out.println("Введіть елементи матриці B:");
        for (int i = 0; i < numRowsB; i++) {
            for (int j = 0; j < numColsB; j++) {
                matrixB[i][j] = scanner.nextLong();
            }
        }

        long a = 3;

        // Виведення матриці B
        System.out.println("Матриця B:");
        for (int i = 0; i < numRowsB; i++) {
            for (int j = 0; j < numColsB; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        // Обчислення матриці C = a * B
        long[][] matrixC = new long[numRowsB][numColsB];
        for (int i = 0; i < numRowsB; i++) {
            for (int j = 0; j < numColsB; j++) {
                matrixC[i][j] = a * matrixB[i][j];
            }
        }

        // Виведення матриці C
        System.out.println("Матриця C = a * B:");
        for (int i = 0; i < numRowsB; i++) {
            for (int j = 0; j < numColsB; j++) {
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }

        // Обчислення суми найменших елементів кожного стовпця матриці C
        long[] minColumnSums = new long[numColsB];
        for (int j = 0; j < numColsB; j++) {
            long min = Long.MAX_VALUE;
            for (int i = 0; i < numRowsB; i++) {
                if (matrixC[i][j] < min) {
                    min = matrixC[i][j];
                }
            }
            minColumnSums[j] = min;
        }

        // Виведення суми найменших елементів кожного стовпця матриці C
        System.out.println("Суми найменших елементів кожного стовпця матриці C:");
        long totalSum = 0;
        for (int j = 0; j < numColsB; j++) {
            System.out.println("Стовпець " + (j + 1) + ": " + minColumnSums[j]);
            totalSum += minColumnSums[j];
        }
        System.out.println("Загальна сума найменших елементів: " + totalSum);

        // Закриваємо сканер
        scanner.close();
    }
}
