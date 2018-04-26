package Triangle;

import categories.Equilateral;
import data.LineSegment;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static java.lang.Math.PI;
import static java.util.EnumSet.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class IsEquilateral_Test {

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
