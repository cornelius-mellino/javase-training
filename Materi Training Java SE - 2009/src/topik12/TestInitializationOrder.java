/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
class SomeClass {
   {
        short s = 8;
        
        System.out.println("initialize super's variable: "+s);
    }
    
    SomeClass(String a) {
        System.out.println("Superclass invoked"+a);
    }
}

public class TestInitializationOrder extends SomeClass {
    private int i;
    
    {
        i = 20;
        double d = 9;
        
        System.out.println("initialize the d variable: "+d);
    }
    
    TestInitializationOrder() {
        super("hhhh");
        //i = 6;
        System.out.println("Constructor invoked");
    }
    
    public static void main(String[] args) {
        TestInitializationOrder t = new TestInitializationOrder();
    }
}
