package com.example.task;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        double area1 = r1.calculateArea();
        double area2 = r2.calculateArea();

        return Double.compare(area1, area2);
    }

    public boolean areCongruent(Rectangle r1, Rectangle r2) {
        return (r1.getLength() == r2.getLength() && r1.getWidth() == r2.getWidth()) ||
                (r1.getLength() == r2.getWidth() && r1.getWidth() == r2.getLength());
    }
}