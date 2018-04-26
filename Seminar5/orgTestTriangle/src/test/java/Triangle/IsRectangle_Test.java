package Triangle;

import categories.Rectangle;
import data.LineSegment;
import data.Point;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.MatcherAssert.assertThat;

public class IsRectangle_Test {

    private static Point A;
    private static Point B;
    private static Point C;

    @BeforeClass
    public static void initPoints() {
        A = new Point(4, 6);B =  new Point(5 , 6); C = new Point(7,8);
    }

    @Category(Rectangle.class)
    @Test
    public void isRectangle() {
        LineSegment firstSide = new LineSegment(A, B);
        LineSegment secondSide = new LineSegment(B, C);
        LineSegment thirdSide = new LineSegment(C, A);
        int c = Math.max(
                firstSide.length();
                secondSide.length();
                thirdSide.length();
        )

        int a;
        int b;
        if (c == firstSide.length()) {
            a = secondSide.length();
            b = thirdSide.length();
        }
        if (c == secondSide.length()) {
            a = firstSide.length();
            b = thirdSide.length();
        }
        if (c == thirdSide.length()) {
            a = secondSide.length();
            b = firstSide.length();
        }



        @Category(Rectangle.class)
        @Test
        assertThat(c*c, a*a+b*b);
        System.out.println("Test");
    }

}
