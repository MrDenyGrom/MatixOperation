package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк (n): ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов (m): ");
        int m = scanner.nextInt();

        Matrix matrix = new Matrix(n, m, scanner);
        ConsoleMenu menu = new ConsoleMenu(scanner);

        int choice;

        do {
            menu.displayMenu();
            choice = menu.getUserChoice();

            switch (choice) {
                case 1:
                    matrix.fillMatrix();
                    break;
                case 2:
                    matrix.printMatrix();
                    break;
                case 3:
                    matrix.calculateColumnSums();
                    break;
                case 4:
                    int[] columnSums = matrix.getColumnSums();
                    printArray(columnSums);
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void printArray(int[] array) {
        System.out.println("Массив сумм столбцов:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Столбец %d: %d%n", i + 1, array[i]);
        }
    }
}
