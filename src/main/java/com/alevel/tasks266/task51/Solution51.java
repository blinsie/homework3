package com.alevel.tasks266.task51;

public class Solution51 {

    public int findRadius(int[] points) {
        double radius = 0;

        if ((points.length == 0) || (!checkArrayLength(points)))
            return 0;

        for (int i = 0; i < points.length - 1; i += 2) {
            if (lengthFromOriginToPoint(points[i], points[i + 1]) > radius)
                radius = lengthFromOriginToPoint(points[i], points[i + 1]);
        }
        return (int) Math.ceil(radius);
    }

    private double lengthFromOriginToPoint(int x, int y) {
        return Math.sqrt((x * x) + (y * y));
    }

    private boolean checkArrayLength(int[] array) {
        return array.length % 2 == 0;
    }
}
