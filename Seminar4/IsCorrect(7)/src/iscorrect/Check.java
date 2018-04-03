/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iscorrect;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 *
 * @author katya
 */
public class Check {
    
    private final static String MAC_REGEXP = "^([\\da-fA-F]{2}:){5}[\\da-fA-F]{2}$";
    private final static Predicate<String> IS_MAC = Pattern.compile(MAC_REGEXP).asPredicate();

    public static boolean isMac(String string) {
        return IS_MAC.test(string);
}
    
}
