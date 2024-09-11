package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // 1. Анонімний клас для MathOperation (додавання)
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition: " + addition.operate(5, 3));

        // 2. Лямбда для StringManipulator (перетворення на верхній регістр)
        StringManipulator toUpperCase = input -> input.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.manipulate("hello world"));

        // 3. Використання посилання на метод для countUppercase
        Function<String, Integer> countUppercase = StringListProcessor::countUppercase;
        System.out.println("Uppercase count: " + countUppercase.apply("Hello World!"));

        // 4. Постачальник для випадкового числа від 1 до 100
        Supplier<Integer> randomNumberSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number: " + randomNumberSupplier.get());
    }
}
