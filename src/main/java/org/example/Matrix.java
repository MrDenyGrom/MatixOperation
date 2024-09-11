package org.example;

import java.util.Scanner;

public class Matrix implements MatrixOperations {
    private final int[][] matrix;
    private final int rows;
    private final int cols;
    private int[] columnSums;
    private final Scanner scanner;

    public Matrix(int rows, int cols, Scanner scanner) {
        this.rows = rows;
        this.cols = cols;
        this.scanner = scanner;
        this.matrix = new int[rows][cols];
        this.columnSums = new int[cols];
    }

    @Override
    public void fillMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Введите элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Матрица заполнена.");
    }

    @Override
    public void printMatrix() {
        System.out.println("Матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public void calculateColumnSums() {
        for (int j = 0; j < cols; j++) {
            columnSums[j] = 0;
            for (int i = 0; i < rows; i++) {
                columnSums[j] += matrix[i][j];
            }
        }
        System.out.println("Суммы по столбцам рассчитаны.");
    }

    @Override
    public int[] getColumnSums() {
        return columnSums;
    }
}
