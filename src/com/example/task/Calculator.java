package com.example.task;

public class Calculator {
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    public double calculatePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getLength() + rectangle.getWidth());
    }
}