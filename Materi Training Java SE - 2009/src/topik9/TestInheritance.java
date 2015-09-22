/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik9;

/**
 *
 * @author Koo
 */
public class TestInheritance {
    public static void main(String[] args) {
        SuperClass spc = new SuperClass();
        System.out.println(spc.count);
        SuperClass spc1 = new SuperClass();
        System.out.println(spc1.count);
        SuperClass spc2 = new SuperClass();
        System.out.println(spc.count);
        SuperClass spc3 = new SuperClass();
        System.out.println(spc3.count);
        
        System.out.println(spc.hashCode());
        System.out.println(spc1.hashCode());
        
        SubClass sc = new SubClass();
        
        spc.methodA();
        
        sc.methodA();
        sc.methodB();
        
        new SuperClass();
    }
}
