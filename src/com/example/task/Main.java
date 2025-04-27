package com.example.task;

import java.util.Scanner;

/*
Постановка задачи:
Программа для работы с прямоугольниками:
1. Расчет площади и периметра
2. Валидация входных данных
3. Сравнение прямоугольников
4. Генерация случайных прямоугольников
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RectanglePrinter printer = new RectanglePrinter();
        RectangleGenerator generator = new RectangleGenerator();

        System.out.println("1. Создать прямоугольник вручную");
        System.out.println("2. Сгенерировать случайный прямоугольник");
        System.out.print("Выберите вариант: ");

        int choice = scanner.nextInt();
        Rectangle rectangle;

        if (choice == 1) {
            System.out.print("Введите длину: ");
            double length = scanner.nextDouble();
            System.out.print("Введите ширину: ");
            double width = scanner.nextDouble();

            try {
                rectangle = new Rectangle(length, width);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
                return;
            }
        } else {
            rectangle = generator.generateRandomRectangle();
            System.out.println("Сгенерирован прямоугольник:");
        }

        printer.printFullInfo(rectangle);

        // Создаем второй прямоугольник для сравнения
        Rectangle anotherRectangle = generator.generateRandomRectangle();
        System.out.println("\nСравниваем с другим прямоугольником:");
        printer.printFullInfo(anotherRectangle);

        RectangleComparator comparator = new RectangleComparator();
        int result = comparator.compare(rectangle, anotherRectangle);
        printer.printComparisonResult(result);
    }
}