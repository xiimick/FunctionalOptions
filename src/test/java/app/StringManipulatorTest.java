package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {

    @Test
    public void testToUpperCase() {
        StringManipulator toUpperCase = input -> input.toUpperCase();
        assertEquals("HELLO WORLD", toUpperCase.manipulate("hello world"), "String should be converted to uppercase");
    }
}
