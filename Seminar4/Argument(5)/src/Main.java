/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.reflect.InvocationTargetException;
import static java.util.Arrays.stream;

/*
5. Дан класс и метод помеченный аннотацией @Argument(value=<целое число>) (аннотацию необходимо создать).
Необходимо вывести таблицу умножения от 1 до числа из аннотации @Argument.
*/

/**
 *
 * @author katya
 */
public class Main {

    public static void main(String[] args) {
        stream(MathPrinter.class.getMethods())
                .filter(method -> method.isAnnotationPresent(Argument.class))
                .forEach(method -> {
                    int value = method.getAnnotation(Argument.class).value();

                    try {
                        method.invoke(null, value);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                    }
                });
    }
}