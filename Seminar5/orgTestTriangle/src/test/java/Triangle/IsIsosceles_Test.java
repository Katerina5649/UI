package Triangle;

import categories.Isosceles;
import data.LineSegment;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.MatcherAssert.assertThat;

public class IsIsosceles_Test {
    public static final double PRECISION = 10e-7;

    @Category(Isosceles.class)
    @Test
    public void isosceles_triangle_is_really_isosceles() {
        LineSegment firstSide = new LineSegment(ISOSCELES.first, ISOSCELES.second);
        LineSegment secondSide = new LineSegment(ISOSCELES.second, ISOSCELES.third);
        assertThat(firstSide.length(),
                closeTo(secondSide.length(), PRECISION));
}
