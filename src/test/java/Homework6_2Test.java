import org.example.Homework6_2.Homework6_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Homework6_2Test {

    @Test
    public void testLongestMonotonicSubarray() {
        final var hw = new Homework6_2();
        Assertions.assertEquals(2,hw.longestMonotonicSubarray(new int[]{1,4,3,3,2}));
        Assertions.assertEquals(1,hw.longestMonotonicSubarray(new int[]{3,3,3,3}));
        Assertions.assertEquals(3,hw.longestMonotonicSubarray(new int[]{3,2,1}));
    }

    @Test
    public void testNullInput() {
        final var hw = new Homework6_2();
        assertThrows(NullPointerException.class, () -> hw.longestMonotonicSubarray(null));
    }

    @Test
    public void testEmptyInput() {
        final var hw = new Homework6_2();
        assertThrows(IllegalArgumentException.class, () -> hw.longestMonotonicSubarray(new int[]{}));
    }
}
