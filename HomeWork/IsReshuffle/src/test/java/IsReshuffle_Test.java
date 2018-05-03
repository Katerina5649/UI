import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IsReshuffle_Test {
    @Test
    private void firstPositiveTest(){
        assertThat(true,
                equalTo(Word.IsReshuffle("word","rowd"))
        );
    }
    @Test
    private void secondPositiveTest(){
        assertThat(true,
                equalTo(Word.IsReshuffle("wo rd","r owd"))
        );
    }


    @Test
    private void firstNegativeTest(){
        assertThat(false,
                equalTo(Word.IsReshuffle("word","owd"))
        );
    }
    @Test
    private void secondNegativeTest(){
        assertThat(false,
                equalTo(Word.IsReshuffle("wo rd","r  owd"))
        );
    }
}
