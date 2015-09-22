/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik9;

/**
 *
 * @author Koo
 */
public class SuperClass {
    public static int count = 0;
    
    public SuperClass() {
        count++;
    }
    protected void methodA() {
        System.out.println("method A");
    }
}
