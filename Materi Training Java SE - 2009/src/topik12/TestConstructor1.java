/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
class Foo {
    
    //Comment the 1st constructor and see what happens.
    
    Foo() {
        System.out.println("Foo's 1st constructor");
    }
    
    Foo(String str) {
        System.out.println("Foo's 2nd constructor: "+str);
    }
    
}

public class TestConstructor1 {
    public static void main(String[] args) {
        Foo f = new Foo();
        
        Foo g = new Foo("G object");
    }
}
