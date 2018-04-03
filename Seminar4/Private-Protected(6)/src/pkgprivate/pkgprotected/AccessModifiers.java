/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgprivate.pkgprotected;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import static java.util.Arrays.stream;
import java.util.function.Predicate;

/**
 *
 * @author katya
 */
class AccessModifiers {
    public static long publicCount(Class clazz) {
        return modifierCount(clazz, Modifier::isPublic);
    }

    public static long protectedCount(Class clazz) {
        return modifierCount(clazz, Modifier::isProtected);

    }

    public static long privateCount(Class clazz) {
        return modifierCount(clazz, Modifier::isPrivate);

    }

    private static long modifierCount(Class clazz,
                                      Predicate<Integer> modifierPredicate) {
        return stream(clazz.getDeclaredFields())
                .map(Member::getModifiers)
                .filter(modifierPredicate)
                .count();
    }

    private AccessModifiers() {
}
}
