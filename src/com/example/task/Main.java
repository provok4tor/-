package com.example.task;
/*
Постановка задачи:
Написать программу для вычисления площади и периметра прямоугольника.
Пользователь вводит длину и ширину, программа выводит результаты.
*/
public class Main {
    public static void main(String[] args) {
        // Создаем объекты
        Rectangle rectangle = new Rectangle(5, 10);
        Calculator calculator = new Calculator();
        RectanglePrinter printer = new RectanglePrinter(); // Новый объект

        // Выводим информацию с помощью RectanglePrinter
        printer.printRectangleInfo(rectangle, calculator);

        // Можно добавить еще один прямоугольник для демонстрации
        Rectangle anotherRectangle = new Rectangle(3, 7);
        printer.printRectangleInfo(anotherRectangle, calculator);
    }
}