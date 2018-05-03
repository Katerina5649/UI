

/*
2. Дана последовательность чисел.
Необходимо написать метод, который будет возвращать количество цифр 3 в данной последовательности чисел.
Например: 12 23 45 82, метод должен вернуть 1. Сигнатура метода следующая: int getThreeNumberCount(int[] numbers).
Для данного метода необходимо написать минимум 2 положительных и 2 отрицательных Unit теста c использованием Junit + Maven + Hamcrest Framework.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

final class Number {
    public  static int getThreeNumberCount(int[] number) {

        return (int) stream(number)
                .boxed()
                .flatMap(Number::getDigits)
                .filter(digit -> digit == 3)
                .count();
    }

    private static Stream<Integer> getDigits(int number){
        if (number < 0) {
            throw new IllegalArgumentException("Number mist be positive");
        }

        List<Integer> result = new ArrayList();
        int source = number;
        while (source > 0) {
            result.add(source % 10);
            source = source / 10;
        }

        return result.stream();

    }
}



