/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;


import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.generate;


/**
 *
 * @author katya
 */
public class ListCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        
        int size = 10;
        
        Predicate<Integer> isEven = number -> number % 2 == 0;
        
        List <Integer> numbers;
        numbers = generate(() -> rnd.nextInt(50))
                .limit(size)
                .peek(number -> System.out.format("%2d ", number ))
                .boxed()
                .collect(toList());
        
        System.out.println();
        
        numbers.stream()
                .map(number -> {
                    if (isEven.test(number)){
                        return number * 3;
                    } else{
                        return number * 5;
                    }
                })
                .forEach(number -> System.out.format("%2d ", number));
                        
                    
                
        
        
        
        

    }
    
}
