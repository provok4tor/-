package com.example.task;
public class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) throws IllegalArgumentException {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Длина и ширина должны быть положительными числами");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width;
    }

    public double calculateDiagonal() {
        return Math.sqrt(length * length + width * width);
    }
}