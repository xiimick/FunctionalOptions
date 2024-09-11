package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListProcessorTest {

    @Test
    public void testCountUppercase() {
        assertEquals(2, StringListProcessor.countUppercase("Hello World!"), "Uppercase count should be correct");
        assertEquals(0, StringListProcessor.countUppercase("hello world"), "Uppercase count should be correct for no uppercase letters");
    }
}
