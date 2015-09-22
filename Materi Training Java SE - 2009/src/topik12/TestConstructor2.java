/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
class NoObject {
    //private constructor
    private NoObject() {
        System.out.println("can't create object of this class");
    }
    
    NoObject(String str) {
        System.out.println("could it be created with the 2nd ?: "+str);
    }
}

public class TestConstructor2 {
    public static void main(String[] args) {
        NoObject no1 = new NoObject();
        
        NoObject no2 = new NoObject("test");
    }
}
