import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Number_Test {
    @Test
    public void one_three_digit_in_valid_array() {
        assertThat(1,
                equalTo(Number.getThreeNumberCount(new int[]{12, 23, 45, 82}))
        );
    }

    @Test
    public void zero_three_digit_in_empty_array() {
        assertThat(0,
                equalTo(Number.getThreeNumberCount(new int[]{}))
        );
    }

    @Test(expected = NullPointerException.class)
    public void npe_when_null() {
        Number.getThreeNumberCount(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegal_argument_excpetion_when_positive() {
        Number.getThreeNumberCount(new int[]{-3});
    }



}
