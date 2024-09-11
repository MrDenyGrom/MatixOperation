package org.example;

import java.util.Scanner;

public class ConsoleMenu implements Menu {
    private final Scanner scanner;

    public ConsoleMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void displayMenu() {
        System.out.println("Меню:");
        System.out.println("1 - Заполнить матрицу");
        System.out.println("2 - Вывести матрицу");
        System.out.println("3 - Найти суммы по столбцам");
        System.out.println("4 - Вывести массив сумм");
        System.out.println("5 - Выход");
    }

    @Override
    public int getUserChoice() {
        System.out.print("Выберите действие: ");
        return scanner.nextInt();
    }
}
