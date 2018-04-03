/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenaryoperation.pkg2;

import java.util.function.Function;
import java.util.function.Predicate;

/*2. Дан предикат condition и две функции ifTrue и ifFalse.
Напишите метод ternaryOperator, который из них построит новую функцию,
возвращающую значение функции ifTrue, если предикат выполнен,
и значение ifFalse иначе. Использовать нужно лямбда выражения
и функциональные интерфейсы Java 8. */




/**
 *
 * @author katya
 */
public final class TenaryOperation2 {
    
    private TenaryOperation2() {
    }

    /**
     *
     * @param <T>
     * @param <R>
     * @param condition
     * @return
     */
    public static <T, R> Function <T, R> tenaryOperator( Predicate<T> condition
                                                          Function<T, R> ifTrue                            
                                                          Function<T, R> ifFalse);

}