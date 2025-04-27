package com.example.task;

public class RectanglePrinter {
    // Метод для красивого вывода информации о прямоугольнике
    public void printRectangleInfo(Rectangle rectangle, Calculator calculator) {
        System.out.println("=== Информация о прямоугольнике ===");
        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь: " + calculator.calculateArea(rectangle));
        System.out.println("Периметр: " + calculator.calculatePerimeter(rectangle));
        System.out.println("===============================");
    }
}