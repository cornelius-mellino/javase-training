/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik15.a;

/**
 *
 * @author Koo
 * 
 * Base class
 * 
 */
public class A {
    private int var1;
    int var2;
    protected int var3;
    public int var4;
    
    public A() {
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
