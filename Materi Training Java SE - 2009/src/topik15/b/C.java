/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik15.b;

import topik15.a.A;

/**
 *
 * @author Koo
 * 
 * Subclass from different package
 */
public class C extends A {
    C() {
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);        
        System.out.println(var4);
    }
    
    public static void main(String[] args) {
        A a = new A();
        
        System.out.println(a.var1);
        System.out.println(a.var2);
        System.out.println(a.var3);
        System.out.println(a.var4);
    }
}
