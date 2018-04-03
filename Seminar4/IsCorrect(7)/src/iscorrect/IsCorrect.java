/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iscorrect;

import java.util.Scanner;

/*
7.Написать программу, которая будет выводить строку "MAC адрес <введенный MAC адрес>: верный",
если введенная в консоли строка будет являться MAC адресом и "MAC адрес <введенный MAC адрес>: не верный",
если введенная в консоли строка не будет MAC адресом.
*/


/**
 *
 * @author katya
 */
public class IsCorrect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String testString = scanner.nextLine();
        
        if(!Check.isMac(testString)){
            System.out.println("Mac адрес " + testString + " неверный");
        } else {
            System.out.println("Mac адрес " + testString + " верный");
        }

        }

    private static boolean isMac(String testString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    }
    
