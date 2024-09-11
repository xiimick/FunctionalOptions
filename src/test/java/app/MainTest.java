package app;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testMain() {
        // Сохраняем оригинальный System.out
        PrintStream originalSystemOut = System.out;

        // Перенаправляем System.out в ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Запускаем метод main
        Main.main(new String[]{});

        // Восстанавливаем оригинальный System.out
        System.setOut(originalSystemOut);

        // Проверяем вывод
        String output = outputStream.toString();

        assertTrue(output.contains("Addition: 8"));
        assertTrue(output.contains("Uppercase: HELLO WORLD"));
        assertTrue(output.contains("Uppercase count: 2"));
        // Здесь можно добавить проверку для случайного числа, если оно стабильно
    }
}
