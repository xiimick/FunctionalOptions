package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationTest {

    @Test
    public void testAddition() {
        MathOperation addition = (a, b) -> a + b;
        assertEquals(8, addition.operate(5, 3), "Addition should be correct");
    }
}
