import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

/*
3. Дана строка. Необходимо при помощи Stream API посчитать количество слов,
которые начинаются на определенную букву и длина которых меньше 5 символов.
И вывести в консоль в формате <слово>:<количество символов>.
*/
public class Words {
   
    private static final int MAX_LENGTH = 5;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите начальную букву");
    
        
        
        String startWord;//(char) System.in.read();
        startWord = scanner.nextLine();
        
        
        String input = scanner.nextLine();
        
        words(input, startWord, MAX_LENGTH)
                .forEach(word -> System.out.println(word + ":" + word.length()));
    }

    private static List<String> words(String string,
                                      String startLetter,
                                      int maxLength) {
        return stream(string.split("\\s+"))
                .filter(word -> word.length() < maxLength)
                .filter(word -> word.startsWith(String.valueOf(startLetter)))
                .collect(toList());
    }
}