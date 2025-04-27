package com.example.task;

import java.util.Random;

public class RectangleGenerator {
    private static final Random random = new Random();
    private static final double MIN_SIZE = 1.0;
    private static final double MAX_SIZE = 20.0;

    public Rectangle generateRandomRectangle() {
        double length = MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble();
        double width = MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble();
        return new Rectangle(length, width);
    }

    public Rectangle generateSquare(double side) {
        return new Rectangle(side, side);
    }
}