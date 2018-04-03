/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isdata;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 *
 * @author katya
 */
public class Check {
    private static  String DATA_REGEXP;
    
    private static final Predicate<String> IS_DATA = Pattern.compile(DATA_REGEXP).asPredicate();

    /**
     *
     * @param data
     * @param format
     * @return
     */
    public static boolean isData(String data, String format) {
        DATA_REGEXP = format;
        return IS_DATA.test(data);
    
}
}