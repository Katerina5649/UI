package data;

import javax.annotation.Nonnull;

import static java.lang.Math.abs;
import static java.lang.Math.acos;


public class LineSegment {
    private final Point first;
    private final Point second;

    public LineSegment(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    public double length() {
        return first.distanceTo(second);
    }

    public double angleTo(LineSegment that) {
        double dotProduct = abs(first.getX() - that.first.getX() * second.getX() - that.second.getX()
                + first.getY() - that.first.getY() * second.getY() - that.second.getY());
        return acos(dotProduct / (length() * that.length()));
    }

    @Nonnull
    public Point getFirst() {
        return first;
    }

    @Nonnull
    public Point getSecond() {
        return second;
    }
}