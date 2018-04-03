/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isdata;

import java.util.Scanner;


/*
8. Написать программу в консоли которой вводим две строки: дату в виде строки и формат даты.
Если введенная дата в виде строки соответствует введенному шаблону,
то необходимо вывести строчку "Дата <введенная дата в виде строки> соответствует шаблону <введенный шаблон даты>" и,
если не соответствует, то необходимо вывести строку "Ошибка.
Дата <введенная дата в консоли> не соответствует шаблону <шаблон даты из консоли>".
Использовать при решении нужно регулярные выражения. Использовать Calendar и LocalData и другие классы работы с датами и временем нельзя.
*/

/**
 *
 * @author katya
 */
public class IsData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        String testData = scanner.nextLine();
        String formatData = scanner.nextLine();
        
        if(Check.isData(testData, formatData)){
            System.out.println("Ошибка.Дата" + testData + "не соответствует шаблону" + formatData);
        } else {
            System.out.println(testData + "соответствует шаблону" + formatData);
        }

        }

    private static boolean isData(String tesData, String formatData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    }
    

