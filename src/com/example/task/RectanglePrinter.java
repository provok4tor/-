package com.example.task;

public class RectanglePrinter {
    public void printFullInfo(Rectangle rectangle) {
        System.out.println("\n=== Полная информация о прямоугольнике ===");
        System.out.printf("Длина: %.2f\n", rectangle.getLength());
        System.out.printf("Ширина: %.2f\n", rectangle.getWidth());
        System.out.printf("Площадь: %.2f\n", Calculator.calculateArea(rectangle));
        System.out.printf("Периметр: %.2f\n", Calculator.calculatePerimeter(rectangle));
        System.out.printf("Диагональ: %.2f\n", Calculator.calculateDiagonal(rectangle));
        System.out.printf("Соотношение сторон: %.2f\n", Calculator.calculateAspectRatio(rectangle));
        System.out.println("Это квадрат? " + (rectangle.isSquare() ? "Да" : "Нет"));
        System.out.println("===================================");
    }

    public void printComparisonResult(int result) {
        System.out.println("\nРезультат сравнения:");
        if (result > 0) {
            System.out.println("Первый прямоугольник больше");
        } else if (result < 0) {
            System.out.println("Второй прямоугольник больше");
        } else {
            System.out.println("Прямоугольники равны");
        }
    }
}