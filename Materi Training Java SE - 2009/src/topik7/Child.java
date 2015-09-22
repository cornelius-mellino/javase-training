/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik7;

/**
 *
 * @author Koo
 */
public class Child extends Parent{
    
    public int add(int a, int b) throws NullPointerException {
        return a+b + 10;
    }
    
    public int add(double a, double b) {
        return (int)(a+b);
    }
    
    @Override
    public float add(float a, float b) {
        return a+b;
    }
    
    public long substract(long a, long b) { //overloaded
        return a-b;
    }
    
    public static int substract(int a, int b) {
        return a-b;
    }
}
