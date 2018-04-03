/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgprivate.pkgprotected;


/*
6. Дан класс. Необходимо вывести количество private, protected и public полей данного класса.
*/

/**
 *
 * @author katya
 */
public class PrivateProtected {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Class clazz = null;
        // TODO code application logic here
        System.out.println("public: " + AccessModifiers.publicCount(clazz));
        System.out.println("protected: " + AccessModifiers.protectedCount(clazz));
        System.out.println("private: " + AccessModifiers.privateCount(clazz));
    }
}
    
    
