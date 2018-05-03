package com.ilgonmic;

import static java.lang.Math.sqrt;

public enum Triangles {
    ISOSCELES(
            new Point(-1, 0),
            new Point(0, 5),
            new Point(1, 0)
    ),
    EQUILATERAL(
            new Point(0, 0),
            new Point(0.5, sqrt(3) / 2),
            new Point(1, 0)
    ),
    RIGHT(
            new Point(0, 0),
            new Point(0, 2),
            new Point(1, 1)
    );

    Point first;
    Point second;
    Point third;

    Triangles(Point first,
              Point second,
              Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
