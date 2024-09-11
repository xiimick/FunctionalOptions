package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomNumberGeneratorTest {

    @Test
    public void testGenerateRandomNumber() {
        int randomNumber = RandomNumberGenerator.generateRandomNumber(1, 100);
        assertTrue(randomNumber >= 1 && randomNumber <= 100, "Random number should be within the specified range");
    }
}
