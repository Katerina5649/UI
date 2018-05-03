package com.ilgonmic;

import com.ilgonmic.category.Equilateral;
import com.ilgonmic.category.Isosceles;
import com.ilgonmic.category.Right;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.ilgonmic.Triangles.*;
import static java.lang.Math.PI;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    public static final double PRECISION = 10e-7;

    @Category(Isosceles.class)
    @Test
    public void isosceles_triangle_is_really_isosceles() {
        LineSegment firstSide = new LineSegment(ISOSCELES.first, ISOSCELES.second);
        LineSegment secondSide = new LineSegment(ISOSCELES.second, ISOSCELES.third);
        assertThat(firstSide.length(),
                closeTo(secondSide.length(), PRECISION));
    }

    @Category(Right.class)
    @Test
    public void right_triangle_is_really_right() {
        LineSegment firstSide = new LineSegment(RIGHT.first, RIGHT.second);
        LineSegment secondSide = new LineSegment(RIGHT.second, RIGHT.third);
        LineSegment thirdSide = new LineSegment(RIGHT.third, RIGHT.first);
        assertThat(PI / 2,
                anyOf(
                        closeTo(firstSide.angleTo(secondSide), PRECISION),
                        closeTo(secondSide.angleTo(thirdSide), PRECISION),
                        closeTo(thirdSide.angleTo(firstSide), PRECISION)
                )
        );
    }

    @Category(Right.class)
    @Test
    public void right_triangle_is_not_equilateral() {
        LineSegment firstSide = new LineSegment(RIGHT.first, RIGHT.second);
        LineSegment secondSide = new LineSegment(RIGHT.second, RIGHT.third);
        LineSegment thirdSide = new LineSegment(RIGHT.third, RIGHT.first);
        assertThat(firstSide.length(),
                allOf(
                        not(closeTo(secondSide.length(), PRECISION)),
                        not(closeTo(thirdSide.length(), PRECISION))
                )
        );
    }

    @Category(Equilateral.class)
    @Test
    public void equilateral_triangle_is_really_equilateral() {
        LineSegment firstSide = new LineSegment(EQUILATERAL.first, EQUILATERAL.second);
        LineSegment secondSide = new LineSegment(EQUILATERAL.second, EQUILATERAL.third);
        LineSegment thirdSide = new LineSegment(EQUILATERAL.third, EQUILATERAL.first);
        assertThat(firstSide.length(),
                allOf(
                        closeTo(secondSide.length(), PRECISION),
                        closeTo(thirdSide.length(), PRECISION)
                )
        );
    }

    @Category(Equilateral.class)
    @Test
    public void equilateral_triangle_is_not_right() {
        LineSegment firstSide = new LineSegment(EQUILATERAL.first, EQUILATERAL.second);
        LineSegment secondSide = new LineSegment(EQUILATERAL.second, EQUILATERAL.third);
        LineSegment thirdSide = new LineSegment(EQUILATERAL.third, EQUILATERAL.first);
        assertThat(PI / 2,
                allOf(
                        not(closeTo(firstSide.angleTo(secondSide), PRECISION)),
                        not(closeTo(secondSide.angleTo(thirdSide), PRECISION)),
                        not(closeTo(thirdSide.angleTo(firstSide), PRECISION))
                )
        );
    }
}
