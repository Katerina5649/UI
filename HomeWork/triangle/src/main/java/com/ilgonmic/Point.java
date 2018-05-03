package com.ilgonmic;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
