package com.example.task;

public final class Calculator {
    private Calculator() {} // Запрещаем создание экземпляров

    public static double calculateArea(Rectangle rectangle) {
        return rectangle.calculateArea();
    }

    public static double calculatePerimeter(Rectangle rectangle) {
        return rectangle.calculatePerimeter();
    }

    public static double calculateDiagonal(Rectangle rectangle) {
        return rectangle.calculateDiagonal();
    }

    public static double calculateAspectRatio(Rectangle rectangle) {
        return rectangle.getLength() / rectangle.getWidth();
    }
}